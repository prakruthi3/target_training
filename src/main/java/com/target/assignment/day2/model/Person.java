package com.target.assignment.day2.model;

public class Person {
    private String name;
    private String addr;

    public String getName() {
        return this.name;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Person(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public String toString() {
        return "Person{name='" + this.name + "', addr='" + this.addr + "'}";
    }
}

