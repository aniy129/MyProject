package csk.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(
        basePackages = "csk.web.controller",
        excludeFilters = @ComponentScan.Filter(Controller.class)
)
public class RootContextConfiguration
{
}
