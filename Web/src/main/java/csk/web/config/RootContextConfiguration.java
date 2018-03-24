package csk.web.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;

/*
 * spring 根上下文
 * */
@Configuration
@PropertySource({"classpath:MyProject.properties", "classpath:database.properties"})//导入资源配置文件
@Import({DataBaseConfiguration.class, ScheduleConfiguration.class, LanguageConfiguration.class})//导入class配置
//@ImportResource("classpath:1.xml")//导入xml配置
@ComponentScan(
        basePackages = {"csk.dal.mybatis", "csk.service.interfaces", "csk.services.implement"},
        excludeFilters = @ComponentScan.Filter(Controller.class)
)
public class RootContextConfiguration {

}
