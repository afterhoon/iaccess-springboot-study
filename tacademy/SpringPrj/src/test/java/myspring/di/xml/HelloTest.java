package myspring.di.xml;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class HelloTest {
    ApplicationContext ctx;

    @Before
    public void init() {
        ctx = new ClassPathXmlApplicationContext("classpath:config.xml");
    }

    @Test
    public void test1() {
        Hello hello = (Hello) ctx.getBean("hello");
        assertEquals("Hello Spring", hello.sayHello());
        System.out.println(hello.sayHello());
        hello.print();

        Printer printer = ctx.getBean("printer", Printer.class);
        assertEquals("Hello Spring", printer.toString());

    }

    @Test
    public void streamTest() {
        String[] strArray = {"a", "p", "p", "l", "e", "b", "a", "n", "a", "n", "a"};
        Arrays.stream(strArray).distinct().limit(5).sorted().forEach(System.out::println);

    }
}