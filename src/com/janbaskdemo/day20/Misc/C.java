package com.janbaskdemo.day20.Misc;

public class C extends Misc
{
    @Override
    public  void m1(String s)
    {
        System.out.println("m1 Method in C class - " + s );
    }

    public  void m1(String s, int j)
    {
        System.out.println("m1 Method in C class - " + s + " number: " + j );
    }

    public static  void m2(String s, char c ) {
        System.out.println("m1 Method in C Class - " + s + " char : " + c);
    }

}
