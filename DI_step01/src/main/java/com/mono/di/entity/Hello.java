package com.mono.di.entity;

import com.mono.di.ui.Printer;

public class Hello {

    private Printer printer; // Printer 인터페이스
    private String name;

    // constructor
    public Hello(Printer printer, String name) {
        this.printer = printer;
        this.name = name;
    }

    public Hello() {
    }

    public Hello(Printer printer) {
        this.printer = printer;
    }

    // method
    public void print(String msg) {
        // name이 있는 경우 name도 함께 출력
        if (this.name == null) {
            printer.print(msg);
        } else {
            printer.print(name + " " + msg);
        }
    }

    // setter
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void setName(String name) {
        this.name = name;
    }
}
