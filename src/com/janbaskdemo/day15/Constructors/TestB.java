package com.janbaskdemo.day15.Constructors;

public class TestB
{
    public static void main(String[] args) {
        B b = new B("Jason", "Manager", false, 6000.76);
        System.out.println(b.empName);
        System.out.println(b.designation);
        System.out.println(b.isMarried);
        System.out.println(b.salary);
    }
}
