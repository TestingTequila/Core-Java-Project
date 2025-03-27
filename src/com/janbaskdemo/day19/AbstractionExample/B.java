package com.janbaskdemo.day19.AbstractionExample;

public class B extends Base
{
    @Override
    public void addition(int a, int b) {
        int sum = 2*a+2*b;
        System.out.println("addition by B: " + sum);
    }
}
