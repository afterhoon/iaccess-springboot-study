package com.mono.di.entity;

import com.mono.di.ui.Printer;

public class Hello {
    private Printer printer;
    private String name;

    public Hello(Printer printer, String name) {
        this.printer = printer;
        this.name = name;
    }

    public Hello() {
    }

    public Hello(Printer printer) {
        this.printer = printer;
    }

    public void print(String msg) {
        if (this.name == null) {
            printer.print(msg);
        } else {
            printer.print(name + " " + msg);
        }
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void setName(String name) {
        this.name = name;
    }
}
