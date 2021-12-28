package com.spring.noxml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * with this class  we can make the configuration without xml file
 * @Configration :to say to spring this class has my configuration
 * @ComponentScan:to say to spring scan all classes under this package
 * this class will be used instead of xml file --> see the main class
 */
@Configuration
@ComponentScan("com.spring.noxml")
public class SpringConfiguration {
}
