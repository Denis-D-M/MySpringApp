package com.epam.spring.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Cat {
    @Value("${name}")
    private String name;

    @Value("${color}")
    private Integer color;

    public String getName() {
        return name;
    }

    public Integer getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(Integer color) {
        this.color = color;
    }
}
