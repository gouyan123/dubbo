package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello," + name + "真胖";
    }
}
