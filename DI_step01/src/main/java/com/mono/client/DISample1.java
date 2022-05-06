package com.mono.client;

import com.mono.di.entity.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DISample1 {
    /* config.xml의 bean에서 setter 방식을 이용 */
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config.xml");

        Hello hello = ctx.getBean(Hello.class);
        hello.print("Hello...");

    }
}
