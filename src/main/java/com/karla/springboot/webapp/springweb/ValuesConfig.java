package com.karla.springboot.webapp.springweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
    @PropertySource(value = "classpath:values.properties", encoding = "UTF-8")
})
public class ValuesConfig {

}
