package com.janbaskdemo.day19.AbstractionExample;

public abstract class Base {
    public abstract void addition(int a, int b);

    public void subtraction(int a, int b) {
        int diff = a - b;
        System.out.println("subtraction: " + diff);
    }

    public void multiplication(int a, int b) {
        int product = a * b;
        System.out.println("multiplication: " + product);
    }

    public void division(int a, int b) {
        int divide = a / b;
        System.out.println("division: " + divide);
    }
}
