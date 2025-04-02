package com.janbaskdemo.day23.ConstructorCalling;

public abstract class C {
    C() {
        System.out.println("Constructor of Abstract Class C");
    }

    C(String name) {
        System.out.println("Constructor of Abstract Class C: " + name);
    }
}
