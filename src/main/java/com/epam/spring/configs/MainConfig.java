package com.epam.spring.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.epam.spring.configs","com.epam.spring.dao", "com.epam.spring.services", "com.epam.spring.factory"})
public class MainConfig {

//    @Bean
//    public SimpleDAO getDAO(){
//        return new SimpleDAOImpl();
//    }
//
//    @Bean
//    public SimpleService getService(){
//        return new SimpleServiceImpl(getDAO());
//    }

}
