package com.janbaskdemo.day19.InterfaceExample;

public class B implements Base {

    @Override
    public void addition(int a, int b) {
        System.out.println("addition By B: " + (2 * a + b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("subtraction By B: " + (2 * a - b));
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println("multiplication By B: " + (2 * a * b));
    }

    @Override
    public void division(int a, int b) {
        System.out.println("division By B: " + (2 * a / b));
    }
}
