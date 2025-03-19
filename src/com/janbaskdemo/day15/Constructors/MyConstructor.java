package com.janbaskdemo.day15.Constructors;

public class MyConstructor
{
    String name;

    public MyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public MyConstructor(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public MyConstructor(String name, boolean isOnLeave) {
        this.name = name;
        this.isOnLeave = isOnLeave;
    }

    public MyConstructor(String name, int age, int salary, boolean isOnLeave) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isOnLeave = isOnLeave;
    }

    int age;
    int salary;
    boolean isOnLeave;
}
