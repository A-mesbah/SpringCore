package com.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * with this class  we can make the configuration without xml file
 *
 * @Configration :to say to spring this class has my configuration
 * @ComponentScan:to say to spring scan all classes under this package
 * this class will be used instead of xml file --> see the main class
 */
@Configuration
public class SpringConfiguration {
    /**
     *
     * @return: the return type is new Object from Master
     * the ID of this object is the name of this Method -->see it in Main Class
     */
    @Bean
    public MasterInterface getMaster() {
        return new Master();
    }

    /**
     *
     * @return:the return type is new Object from Master but with param Constructor
     * this Constructor will take anything of Type --->MasterInterface
     * But you should be careful from which implementation you will take i mean { getClassImplementMasterInterface ()  ----> can return
     *                                                                                                                   new Master () ,
     *                                                                                                                   new Master(new MasterInterface )
     *                                                                                                                   new DerivedClass()
     *                                                                                                                   }
     */

    @Bean
    public MasterInterface getMasterWithConstructor() {
        return new Master(getClassImplementMasterInterface());
    }

    /**
     *
     * @return: you can change the return type with any class implement this interface(Master,DerivedClass ------> MasterInterface)
     */

    @Bean
    public MasterInterface  getClassImplementMasterInterface () {
        return new DerivedClass();
    }
}
