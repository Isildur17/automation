package com.emerline.sandbox;

public class Employee {
    private String name;
    private int age;
    private String address;

    public Employee() {

    }

    public Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }
}

