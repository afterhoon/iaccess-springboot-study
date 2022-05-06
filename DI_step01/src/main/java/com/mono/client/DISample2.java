package com.mono.client;

import com.mono.di.entity.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DISample2 {
    /* config2.xml의 bean에서 constructor 방식을 이용 */
    public static void main(String[] args) {

        // 애플리케이션 컨텍스트가 config3.xml의 설정정보를 참고
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config2.xml");

        Hello hello = ctx.getBean(Hello.class); // Hello 객체를 생성하지 않고 Bean으로 받아옴
        hello.print("Hello..."); // 받아온 객체도 동일한 기능이 가능함

    }
}
