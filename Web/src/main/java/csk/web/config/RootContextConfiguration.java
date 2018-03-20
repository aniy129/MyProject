package csk.web.config;


import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
/*
* spring 根上下文
* */
@Configuration
@Import({DataBaseConfiguration.class,ScheduleConfiguration.class})
//@ImportResource("classpath:1.xml")//导入xml配置
@PropertySource(value={"classpath:database.properties"})//导入class配置
@ComponentScan(
        basePackages = {"csk.dal.mybatis","csk.service.interfaces","csk.services.implement"},
        excludeFilters = @ComponentScan.Filter(Controller.class)
)
public class RootContextConfiguration
{


}
