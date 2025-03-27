package com.janbaskdemo.day19.InterfaceExample;

public class A implements Base
{

    @Override
    public void addition(int a, int b) {
        System.out.println("addition By A: "+(a+b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("subtraction By A: " +(a-b));
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println("multiplication By A: " +(a*b));
    }

    @Override
    public void division(int a, int b) {
        System.out.println("division By A: " +(a/b));
    }
}
