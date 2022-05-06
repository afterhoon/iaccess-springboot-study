package com.mono.di.entity;

import com.mono.di.ui.BluePrinter;
import com.mono.di.ui.ColorPrinter;
import com.mono.di.ui.MonoPrinter;
import com.mono.di.ui.Printer;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Collection;

public class JUnitTest {

    static ApplicationContext ctx;

    @BeforeClass
    public static void beforeClassMessage() {
        ctx = new ClassPathXmlApplicationContext("classpath:config.xml");
        System.out.println("beforeClassMessage");
        System.out.println("ctx = " + ctx);
    }

    @Ignore
//    @Before
    public void beforeMessage() {
        System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Test Start: ");
        System.out.println("this = " + this);
    }

    @Ignore
//    @After
    public void afterMessage() {
        System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Test End: ");
        System.out.println("this = " + this);

    }

    @Ignore // 테스트에서 제외
    @Test
    public void manualTest1() {
        Printer printer = new ColorPrinter();
        Hello hello = new Hello(printer);
        hello.print("aaa");
    }

    @Ignore
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

        System.out.println("springContainerTest1.this = " + this);
        System.out.println("springContainerTest1.ctx = " + ctx);

        Hello hello = ctx.getBean(Hello.class);
        hello.print("Hello...");

    }

    @Test
    public void springContainerTest2() {
        // constructor 방식

        System.out.println("springContainerTest2.this = " + this);
        System.out.println("springContainerTest2.ctx = " + ctx);

        Hello hello = ctx.getBean(Hello.class);
        hello.print("Hello...");
    }

    @Test
    public void springContainerTest3() {
        // constructor 방식 (p태그를 이용해서 한줄로)

        System.out.println("springContainerTest3.this = " + this);
        System.out.println("springContainerTest3.ctx = " + ctx);

        Hello hello = ctx.getBean(Hello.class);
        hello.print("Hello...");
    }
}