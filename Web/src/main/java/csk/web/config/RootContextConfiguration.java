package csk.web.config;


import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
@Import(DataBaseConfig.class)
//@ImportResource("classpath:1.xml")
@PropertySource(value={"classpath:database.properties"})
@ComponentScan(
        basePackages = {"csk.dal.mybatis","csk.service.interfaces","csk.services.implement"},
        excludeFilters = @ComponentScan.Filter(Controller.class)
)
public class RootContextConfiguration
{


}
