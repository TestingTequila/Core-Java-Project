package com.janbaskdemo.day15;

public class TestMyConstructor
{
    public static void main(String[] args) {
        MyConstructor mc = new MyConstructor("Jason", true);
        System.out.println(mc.name);
        System.out.println(mc.age);
        System.out.println(mc.salary);
        System.out.println(mc.isOnLeave);

    }
}
