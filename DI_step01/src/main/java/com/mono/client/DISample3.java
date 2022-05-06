package com.mono.client;

import com.mono.di.entity.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DISample3 {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config3.xml");

        Hello hello = ctx.getBean(Hello.class);
        hello.print("Hello...");

    }
}
