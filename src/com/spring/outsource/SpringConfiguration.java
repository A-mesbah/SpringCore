package com.spring.outsource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:com/spring/outsource/data.properties")
@ComponentScan("com.spring.outsource")
public class SpringConfiguration {
   /* @Bean
    public Employee getEmployee(){
        return new Employee();
    }*/
}
