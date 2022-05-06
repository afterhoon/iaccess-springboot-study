package com.mono.client;

import com.mono.di.entity.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DISample2 {
    /* setter */
//    public static void main(String[] args) {
//
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config.xml");
//
//        Hello hello = ctx.getBean(Hello.class);
//        hello.print("Hello...");
//
//    }

    /* constructor */
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config2.xml");

        Hello hello = ctx.getBean(Hello.class);
        hello.print("Hello...");

    }
}
