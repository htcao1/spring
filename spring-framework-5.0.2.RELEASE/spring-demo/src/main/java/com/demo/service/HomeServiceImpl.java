package com.demo.service;

import com.demo.service.HomeService;

public class HomeServiceImpl implements HomeService {

    @Override
    public String hello(String name) {
        System.out.println("hello：" + name);
        return "hello：" + name;
    }
}