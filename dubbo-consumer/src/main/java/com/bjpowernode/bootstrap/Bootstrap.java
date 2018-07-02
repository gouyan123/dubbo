package com.bjpowernode.bootstrap;

import com.bjpowernode.dubbo.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

public class Bootstrap {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        HelloService helloService = (HelloService) context.getBean("helloService");
        String result = helloService.sayHello("小唐");
        System.out.println(result);
    }
}
