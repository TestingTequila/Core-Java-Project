package com.janbaskdemo.day19.InterfaceExample;

public class C implements Base {

    @Override
    public void addition(int a, int b) {
        System.out.println("addition By C: " + (3 * a + b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("subtraction By C: " + (3 * a - b));
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println("multiplication By C: " + (3 * a * b));
    }

    @Override
    public void division(int a, int b) {
        System.out.println("division By C: " + (3 * a / b));
    }
}
