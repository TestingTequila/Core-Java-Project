package com.janbaskdemo.day25;

public class UnderstandingThrowsBehaviour {
    public static void main(String[] args) throws  ArithmeticException{
        try {
            m3(12, 4);
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        System.out.println("All the methods are executed....and all message have been printed...");

    }

    public static int m1(int a, int b) throws ArithmeticException{
        int divide = a / b;
        System.out.println("M1 method Divide value: " + divide);
        return divide;
    }

    public static void m2(int a, int b) throws ArithmeticException {
        m1(12, 0);
        System.out.println("This is m2 method....");
    }

    public static void m3(int a, int b) throws ArithmeticException{
        m2(12, 3);
        System.out.println("This is m3 method....");
    }
}
