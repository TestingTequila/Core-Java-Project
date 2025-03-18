package com.janbaskdemo.day14.Overloading;

public class TestMaths
{
    public static void main(String[] args) {
        Maths maths = new Maths();
        maths.addition(12,8);
        maths.addition(12.4, 8.6);
        maths.addition(12.45f, 34.56, 67);
    }
}
