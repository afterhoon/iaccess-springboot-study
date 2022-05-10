package com.mono.di.entity;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S3_JunitBeforeEachTest {

    private ApplicationContext ctx;

    @Before
    public void beforeMessage() {
        ctx = new ClassPathXmlApplicationContext("classpath:config.xml");
        System.out.println("before.ctx = " + ctx);
    }

    @Test
    @DisplayName("springContainerTest1의 Before this 확인")
    public void springContainerTest1() {

        System.out.println("springContainerTest1.this = " + this);
        System.out.println("springContainerTest1.ctx = " + ctx);
        Hello hello = ctx.getBean(Hello.class);
        hello.print("hello...");
    }

    @Test
    @DisplayName("springContainerTest2의 Before this 확인")
    public void springContainerTest2() {

        System.out.println("springContainerTest2.this = " + this);
        System.out.println("springContainerTest2.ctx = " + ctx);
        Hello hello = ctx.getBean(Hello.class);
        hello.print("hello...");
    }
}
