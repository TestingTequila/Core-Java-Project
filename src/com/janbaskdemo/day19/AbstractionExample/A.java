package com.janbaskdemo.day19.AbstractionExample;

public class A extends Base
{
    @Override
    public void addition(int a, int b) {
        int sum =a+b;
        System.out.println("addition by A: " + sum);
    }
}
