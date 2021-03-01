package com.epam.spring.factory;

import com.epam.spring.dao.Cat;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomColorCatFactory implements FactoryBean<Cat> {
    @Override
    public Cat getObject() throws Exception {
        Cat cat = new Cat();
        cat.setColor(new Random().nextInt(100));
        cat.setName("Cat with color - " + cat.getColor());
        return cat;
    }

    @Override
    public Class<?> getObjectType() {
        return Cat.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
