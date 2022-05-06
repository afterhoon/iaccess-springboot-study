package com.mono.client;

import com.mono.di.ui.BluePrinter;
import com.mono.di.ui.ColorPrinter;
import com.mono.di.ui.MonoPrinter;
import com.mono.di.ui.Printer;

import java.util.ArrayList;
import java.util.Collection;

public class DISample {
    // 직접 구현클래스로 객체를 생성
    public static void main(String[] args) {
        Printer printer = new ColorPrinter();
        Printer printer2 = new MonoPrinter();
        Printer printer3 = new BluePrinter();
//        Hello hello = new Hello(printer3);
//        hello.print("Hello");

        Collection<Printer> printers = new ArrayList<>();
        printers.add(printer);
        printers.add(printer2);
        printers.add(printer3);
        printers.forEach(p->p.print("Hello!!!"));
    }
}
