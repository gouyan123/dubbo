package com.bjpowernode.bootstrap;

import com.bjpowernode.dubbo.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

public class Bootstrap {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        /**获取远程provider的 helloService对象*/
        HelloService helloService = (HelloService) context.getBean("helloService");
        /**通过动态代理，将对象，方法名称，参数发送到provider端执行，然后将返回值传递回来*/
        String result = helloService.sayHello("小唐");
        System.out.println(result);
    }
}
