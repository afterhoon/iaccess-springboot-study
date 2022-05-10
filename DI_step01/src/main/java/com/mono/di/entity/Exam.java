package com.mono.di.entity;

import com.mono.di.ui.Printer;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exam {

    private Printer printer;
    private List<String> names;
    private List<Person> person;
    private Map<String, Integer> ages;
    private Set<String> emails;

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public Map<String, Integer> getAges() {
        return ages;
    }

    public void setAges(Map<String, Integer> ages) {
        this.ages = ages;
    }

    public Set<String> getEmails() {
        return emails;
    }

    public void setEmails(Set<String> emails) {
        this.emails = emails;
    }
}
