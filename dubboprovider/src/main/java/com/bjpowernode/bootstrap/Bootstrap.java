package com.bjpowernode.bootstrap;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

public class Bootstrap {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        /*运行spring容器*/
        context.start();
        /*一直处于读的状态，避免程序一运行就结束了，运行结束了，消费者将无法调用*/
        System.in.read();
    }
}
