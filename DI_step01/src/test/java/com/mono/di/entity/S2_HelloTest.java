package com.mono.di.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class S2_HelloTest {

    @DisplayName("Container를 사용한 객체주입(DI)")
    @ParameterizedTest
    @ValueSource(strings = {"config.xml", "config2.xml", "config3.xml"})
    public void springContainerTest1(String resourceFileName) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:" + resourceFileName);

        String[] beanName = ctx.getBeanDefinitionNames();
        Arrays.stream(beanName).iterator().forEachRemaining(System.out::println);

        Hello hello = ctx.getBean(Hello.class);
        hello.print("hello...");
    }
}
