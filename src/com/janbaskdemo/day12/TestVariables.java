package com.janbaskdemo.day12;

public class TestVariables
{
    public static void main(String[] args) {

        System.out.println("==================Variables as Global/Class Level=============");

        Maths m1 = new Maths();
        m1.x=12;
        m1.y=8;
        m1.addition();
        m1.subtraction();

        Maths m11 = new Maths();
        m11.x=34;
        m11.y=6;
        m11.addition();
        m11.subtraction();

        System.out.println("==================Variables as Parameters=============");

        Maths2 m2= new Maths2();
        m2.addition(12,8);
        m2.subtraction(10,3);

        Maths2 m22 = new Maths2();
        m22.addition(45, 5);
        m22.subtraction(50, 25);

        System.out.println("==================Variables as Local =============");
        Maths3 m3 = new Maths3();
        m3.addition();
        m3.subtraction();

        Maths3 m33 = new Maths3();
        m33.addition();
        m33.subtraction();
    }
}
