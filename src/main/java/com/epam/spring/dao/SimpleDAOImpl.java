package com.epam.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class SimpleDAOImpl implements SimpleDAO{
    @Override
    public String getData() {
        return "Bingo";
    }
}
