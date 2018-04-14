package csk.web.config;

import csk.web.config.filter.LoginInterceptor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.support.DomainClassConverter;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.data.web.SortHandlerMethodArgumentResolver;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.RequestToViewNameTranslator;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.inject.Inject;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;

/*
 * web站点配置类
 * */
//WebMvcConfigurer 代替 WebMvcConfigurerAdapter
@Configuration
@EnableWebMvc
@EnableSpringDataWebSupport //支持从控制参数直接创建Pageable对象
@ComponentScan(
        basePackages = "csk.web.controller",
        useDefaultFilters = false,
        includeFilters = @ComponentScan.Filter(Controller.class)
)
public class ServletContextConfiguration implements WebMvcConfigurer {

    private static final Logger log = LogManager.getLogger();
    @Inject
    SpringValidatorAdapter validator;

    @Inject
    ApplicationContext applicationContext;

    @Override
    public Validator getValidator() {
        return this.validator;
    }

    /*
     * 添加拦截器
     * */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).excludePathPatterns("/static/*", "/", "/home", "/home/index");
        registry.addInterceptor(new LocaleChangeInterceptor());
    }

    /**
     * 为Pageable添加参数支持
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        Sort defaultSort = new Sort(new Sort.Order(Sort.Direction.DESC, "id"));
        Pageable defaultPageable = new PageRequest(1, 10, defaultSort);

        SortHandlerMethodArgumentResolver sortResolver =
                new SortHandlerMethodArgumentResolver();
        sortResolver.setSortParameter("paging.sort");
        sortResolver.setFallbackSort(defaultSort);

        PageableHandlerMethodArgumentResolver pageableResolver =
                new PageableHandlerMethodArgumentResolver(sortResolver);
        pageableResolver.setMaxPageSize(100);
        pageableResolver.setOneIndexedParameters(true);
        pageableResolver.setPrefix("paging.");
        pageableResolver.setFallbackPageable(defaultPageable);

        resolvers.add(sortResolver);
        resolvers.add(pageableResolver);
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        if (!(registry instanceof FormattingConversionService)) {
            log.warn("Unable to register Spring Data JPA converter.");
            return;
        }

        DomainClassConverter<FormattingConversionService> converter =
                new DomainClassConverter<>((FormattingConversionService) registry);
        converter.setApplicationContext(this.applicationContext);
    }

    /*
     *设置为utf-8编码
     * */
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        StringHttpMessageConverter stringConverter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        converters.add(0, stringConverter);
    }

    /*
     * 设置locale存储方式为cookie
     * */
    @Bean
    public LocaleResolver localeResolver() {
        CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
        cookieLocaleResolver.setDefaultLocale(Locale.CHINA);
        cookieLocaleResolver.setCookieName("my_project_language_country");
        cookieLocaleResolver.setCookieHttpOnly(true);
        cookieLocaleResolver.setCookieMaxAge(60 * 60 * 24 * 30);//过期时间30天
        cookieLocaleResolver.setCookiePath("/");
        return cookieLocaleResolver;
    }

    /*
     * 视图信息配置
     * */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver =
                new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    /*
     * 默认视图名称转换
     * */
    @Bean
    public RequestToViewNameTranslator viewNameTranslator() {
        return new DefaultRequestToViewNameTranslator();
    }
}
