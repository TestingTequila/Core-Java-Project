package com.janbaskdemo.day17._4thisInMethodCalling;

public class MethodCallingUsingThisKeyword
{
    public  void m1(String a, int b)
    {
        System.out.println("method m1 with " + a + " and " +b);
        this.m2("Ashish");
        this.m3(34);
    }

    public  void m2(String a)
    {
        System.out.println("method m1 with " + a);
    }

    public  void m3(int b)
    {
        System.out.println("method m1 with " +b);
    }

    public  void m3(int b, boolean check)
    {
        System.out.println("method m1 with " +b + " and check as " + check);
    }
}
