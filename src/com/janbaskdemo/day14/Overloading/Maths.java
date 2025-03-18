package com.janbaskdemo.day14.Overloading;

public class Maths
{

    public void addition(int a, int b)
    {
        int sum=a+b;
        System.out.println("Addition1 = " + sum);
    }

    public void addition(double a, int b)
    {
        double sum=a+b;
        System.out.println("Addition1 = " + sum);
    }

    public void addition(double a, double b)
    {
        double sum=a+b;
        System.out.println("Addition1 = " + sum);
    }


    public void addition(double a, float b)
    {
        double sum=a+b;
        System.out.println("Addition1 = " + sum);
    }

    public void addition(float a, double b)
    {
        double sum=a+b;
        System.out.println("Addition1 = " + sum);
    }

    public void addition(float a, double b, int c)
    {
        double sum=a+b+c;
        System.out.println("Addition1 = " + sum);
    }

    public double addition(float a, double b, char c)
    {
        double sum=a+b+c;
        System.out.println("Addition1 = " + sum);
        return sum;
    }

}
