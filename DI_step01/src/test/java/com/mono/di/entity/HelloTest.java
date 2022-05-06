package com.mono.di.entity;

import com.mono.di.ui.BluePrinter;
import com.mono.di.ui.ColorPrinter;
import com.mono.di.ui.MonoPrinter;
import com.mono.di.ui.Printer;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Collection;

public class HelloTest {

    @Test
    public void manualTest1() {
        Printer printer = new ColorPrinter();
        Hello hello = new Hello(printer);
        hello.print("aaa");
    }

    @Test
    public void manualTest2() {
        Printer printer = new ColorPrinter();
        Printer printer2 = new MonoPrinter();
        Printer printer3 = new BluePrinter();
        Collection<Printer> printers = new ArrayList<>();
        printers.add(printer);
        printers.add(printer2);
        printers.add(printer3);
        printers.forEach(p->p.print("Hello!!!"));
    }

    @Test
    public void springContainerTest1() {
        // setter 방식
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config.xml");

        Hello hello = ctx.getBean(Hello.class);
        hello.print("Hello...");

    }

    @Test
    @Ignore // 테스트에서 제외
    public void springContinerTest2() {
        // constructor 방식
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config2.xml");

        Hello hello = ctx.getBean(Hello.class);
        hello.print("Hello...");
    }

    @Test
    public void springContainerTest3() {
        // constructor 방식 (p태그를 이용해서 한줄로)
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config3.xml");

        Hello hello = ctx.getBean(Hello.class);
        hello.print("Hello...");
    }
}