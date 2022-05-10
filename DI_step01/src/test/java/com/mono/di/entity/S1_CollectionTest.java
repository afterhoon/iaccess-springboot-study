package com.mono.di.entity;

import com.mono.di.ui.BluePrinter;
import com.mono.di.ui.ColorPrinter;
import com.mono.di.ui.MonoPrinter;
import com.mono.di.ui.Printer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public class S1_CollectionTest {

    @Test
    @DisplayName("프레임워크 사용없는 객체 생성 테스트")
    public void manualTest1() {
        Printer printer = new BluePrinter();
        Hello hello = new Hello(printer, "Blue");
        hello.print("aaa");
    }

    @Test
    @DisplayName("다형성을 이용한 프린트")
    public void manualTest() {
        Collection<Printer> printers = new LinkedHashSet<>();
        printers.add(new BluePrinter());
        printers.add(new ColorPrinter());
        printers.add(new MonoPrinter());
        printers.forEach(p->p.print("Hello"));
    }

    @Test
    @DisplayName("스트림을 이용한 컬렉션 출력")
    public void filterTest() {
        List<Integer> seq = Arrays.asList(1, 2, -3, 4, 5);
        seq.stream().filter(ele -> ele.intValue() > 2).forEach(System.out::println);
    }
}
