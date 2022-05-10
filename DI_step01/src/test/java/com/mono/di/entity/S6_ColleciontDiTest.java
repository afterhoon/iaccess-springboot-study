package com.mono.di.entity;

import com.mono.di.ui.Printer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;


public class S6_ColleciontDiTest {

    private ApplicationContext context ;

    @BeforeEach
    public void before(){
        //IoC 컨테이너를 생성
        //1.ApplicationContext 객체 생성
        context = new ClassPathXmlApplicationContext("classpath:config5.xml");
        System.out.println("======================");
        System.out.println("컨테이너생성");
        System.out.println("Before 객체 : " + this);
        System.out.println("컨테이너 객체 : " + context);
    }


    @DisplayName("Collection Di 테스트")
    @Test
    public void test() {

        Exam exam = context.getBean(Exam.class);
        exam.print("HELLO");

        /* List */

        List<String> list = exam.getNames();

        list.forEach(System.out::println);

        System.out.println("------------------------");

        /* 확장 for */
        for (String value : list) {
            // nmList.accept(value);
            System.out.println(value);
        }

        System.out.println("------------------------");

        /* Iterator */

        Iterator<String> lst = list.iterator();
        while (lst.hasNext()) {
            System.out.println(lst.next());
        }

        System.out.println("------------------------");

        /* Map */

        /* enhenced for */
        Map<String, Integer> ages = exam.getAges();
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println("KEY : " + entry.getKey() + ", VALUE : " + entry.getValue());
        }

        // Iterator가 안되서 set(keyset)을 통해서 iterator를 얻음
        Iterator<String> keys = ages.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println("key : " + key + ", value : " + ages.get(key));
        }

        /* lamda */

        ages.forEach((key, value) -> System.out.println("key:" + key + " | value:" + value));
        ages.entrySet().forEach(entry -> System.out.println("key:" + entry.getKey() + " | value:" + entry.getValue()));
        ages.keySet().forEach(key -> System.out.println("key : " + key));
        ages.values().forEach(value -> System.out.println("value : " + value));

        System.out.println("------------------------");

        /* Set */

        Set<String> hs = exam.getEmails();
        Iterator<String> hi = hs.iterator();

        /* lamda */
        hs.forEach(s -> System.out.println(s));

        System.out.println("------------------------");

        /* 중복제거 */
        /* Iterator */
        while (hi.hasNext()) {
            System.out.println(hi.next());
        }

        System.out.println("------------------------");

        /* enhenced for */

        for (String s : hs) {
            System.out.println(s);
        }

        System.out.println("------------------------");

        /* List 정렬 */
        List<Person> persons = exam.getPersons();

        System.out.println("--------person name sort before ----------------");

        persons.forEach(row -> System.out.println(row.getName() + " : " + row.getAge()));

        Collections.sort(persons);

        System.out.println("--------person name sort after----------------");

        persons.forEach(row -> System.out.println(row.getName() + " : " + row.getAge()));

        // persons.forEach(row->System.out.println(row.getName()));

        System.out.println("------------------------");

    }

}