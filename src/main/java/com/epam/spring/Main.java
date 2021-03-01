package com.epam.spring;


import com.epam.spring.dao.Cat;
import com.epam.spring.services.SimpleService;
import com.epam.spring.configs.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.epam.spring.dao", "com.epam.spring.services");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:context.xml");
        SimpleService service = context.getBean(SimpleService.class);
        Cat cat = context.getBean(Cat.class);

        System.out.println(cat.getColor());

    }
}
