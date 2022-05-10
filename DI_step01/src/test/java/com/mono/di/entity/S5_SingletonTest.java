package com.mono.di.entity;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class S5_SingletonTest {

    ApplicationContext ctx;

    @BeforeEach
    public void before() {
        ctx = new ClassPathXmlApplicationContext("classpath:config4.xml");
        String[] beanName = ctx.getBeanDefinitionNames();
        Arrays.stream(beanName).iterator().forEachRemaining(System.out::println);
    }

    @Test
    @DisplayName("SingleTon 객체 테스트")
    public void singletonTest() {

        Hello hello1 = ctx.getBean("hello", Hello.class);
        Hello hello2 = ctx.getBean("hello", Hello.class);

        Assertions.assertSame(hello1, hello2);
        System.out.println("hello1 = " + hello1);
        System.out.println("hello2 = " + hello2);
    }

    @Test
    @DisplayName("Prototype 객체 테스트")
    public void prototypeTest() {

        Hello hello1 = ctx.getBean("protohello", Hello.class);
        Hello hello2 = ctx.getBean("protohello", Hello.class);

        Assertions.assertSame(hello1, hello2);
        System.out.println("hello1 = " + hello1);
        System.out.println("hello2 = " + hello2);
    }
}
