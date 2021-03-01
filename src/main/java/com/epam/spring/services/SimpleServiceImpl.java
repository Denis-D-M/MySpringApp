package com.epam.spring.services;

import com.epam.spring.dao.SimpleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleServiceImpl implements SimpleService{


    SimpleDAO dao;

    @Autowired
    public SimpleServiceImpl(SimpleDAO dao) {
        this.dao = dao;
    }

    @Override
    public String getTestService() {
        String str = dao.getData() + "| Service";
        return str;
    }
}
