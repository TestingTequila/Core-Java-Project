package com.janbaskdemo.day19.InterfaceExample;

public class D implements Base {

    @Override
    public void addition(int a, int b) {
        System.out.println("addition By D: " + (4 * a + b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("subtraction By D: " + (4 * a - b));
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println("multiplication By D: " + (4 * a * b));
    }

    @Override
    public void division(int a, int b) {
        System.out.println("division By D: " + (4 * a / b));
    }
}
