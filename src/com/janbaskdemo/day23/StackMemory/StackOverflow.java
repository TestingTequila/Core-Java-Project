package com.janbaskdemo.day23.StackMemory;

public class StackOverflow {
    public void m1() {
        m2();
        System.out.println("m1 method...");
    }

    public void m2() {
        m3();
        System.out.println("m2 method...");
    }

    public void m3() {
        m1();
        System.out.println("m3 method...");
    }
}
