package csk.web.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import csk.web.annotation.RestEndpointAdvice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.stereotype.Controller;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

/*
* Restful配置类
* */
@Configuration
@EnableWebMvc
@ComponentScan(
        basePackages = {"csk.web.restful","csk.web.annotation","csk.web.exception"},
        useDefaultFilters = false,
        includeFilters = @ComponentScan.Filter({Controller.class,RestEndpointAdvice.class})
)
public class RestfulContextConfiguration implements WebMvcConfigurer {


    @Inject
    ApplicationContext applicationContext;
    @Inject
    SpringValidatorAdapter validator;
    @Inject
    ObjectMapper objectMapper;
    @Inject
    Marshaller marshaller;
    @Inject
    Unmarshaller unmarshaller;


    /**
     * Configure the {@link HttpMessageConverter}s to use for reading or writing
     * to the body of the request or response. If no converters are added, a
     * default list of converters is registered.
     * <p><strong>Note</strong> that adding converters to the list, turns off
     * default converter registration. To simply add a converter without impacting
     * default registration, consider using the method
     * {@link #extendMessageConverters(List)} instead.
     *
     * @param converters initially an empty list of converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new SourceHttpMessageConverter<>());

        MarshallingHttpMessageConverter xmlConverter =
                new MarshallingHttpMessageConverter();
        xmlConverter.setSupportedMediaTypes(Arrays.asList(
                new MediaType("application", "xml"),
                new MediaType("text", "xml")
        ));
        xmlConverter.setMarshaller(this.marshaller);
        xmlConverter.setUnmarshaller(this.unmarshaller);
        converters.add(xmlConverter);

        MappingJackson2HttpMessageConverter jsonConverter =
                new MappingJackson2HttpMessageConverter();
        jsonConverter.setSupportedMediaTypes(Arrays.asList(
                new MediaType("application", "json"),
                new MediaType("text", "json")
        ));
        jsonConverter.setObjectMapper(this.objectMapper);
        converters.add(jsonConverter);
    }
}
