package myspring.di.xml.test;

import myspring.di.xml.Hello;
import myspring.di.xml.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloBeanTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config.xml");
        Hello hello = (Hello) ctx.getBean("hello");
        System.out.println(hello.sayHello());
        hello.print();
        Printer printer = (Printer) ctx.getBean("printer");
        System.out.println("printer.toString() = " + printer.toString());

        Hello hello2 = ctx.getBean("hello", Hello.class);
        hello2.print();

        System.out.println("hello == hello2 = " + (hello == hello2));
    }
}
