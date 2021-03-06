package csk.web.config;


import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Controller;

/*
 * spring 根上下文
 * */
@Configuration
@PropertySource({"classpath:MyProject.properties", "classpath:database.properties"})//导入资源配置文件
@ComponentScan(
        basePackages = {"csk.dal.mybatis",
                "csk.dal.jpa",
                "csk.service.interfaces",
                "csk.services.implement"},
        excludeFilters = @ComponentScan.Filter(Controller.class)
)
@Import({DataBaseConfiguration.class,
        ScheduleConfiguration.class,
        LanguageConfiguration.class,
        ValidateConfiguration.class,
        RestAndSoapConfiguration.class,
        JPAConfiguration.class})//导入class配置
//@ImportResource("classpath:1.xml")//导入xml配置
public class RootContextConfiguration {

    /*
     * 先加载资源
     * */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
