package csk.web.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

import javax.inject.Inject;

/*
* 验证配置
* */
public class ValidateConfiguration {
    @Inject
    MessageSource messageSource;
    @Bean
    public LocalValidatorFactoryBean localValidatorFactoryBean()
    {
        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
        validator.setValidationMessageSource(this.messageSource);
        return validator;
    }

//    @Bean
//    public MethodValidationPostProcessor methodValidationPostProcessor()
//    {
//        MethodValidationPostProcessor processor = new MethodValidationPostProcessor();
//        processor.setValidator(this.localValidatorFactoryBean());
//        return processor;
//    }

}
