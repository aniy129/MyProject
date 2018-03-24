package csk.web.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import javax.inject.Inject;
import java.nio.charset.StandardCharsets;

public class LanguageConfiguration {

    @Inject
    private Environment env; //在@Value不能获取到值的时候可以使用手动的方式 env.getProperty("spring.language.CacheValue")

    /*
     * 多语言资源配置
     * */
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource =
                new ReloadableResourceBundleMessageSource();
        String cacheValue = env.getProperty("spring.language.CacheValue");
        messageSource.setCacheSeconds(Integer.parseInt(cacheValue));
        messageSource.setDefaultEncoding(StandardCharsets.UTF_8.name());
        messageSource.setBasenames("/WEB-INF/i18n/messages");
        messageSource.setUseCodeAsDefaultMessage(true);
        return messageSource;
    }
}
