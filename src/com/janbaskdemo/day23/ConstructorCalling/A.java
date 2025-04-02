package com.janbaskdemo.day23.ConstructorCalling;

public  class A {
    public  A()
    {
        System.out.println("Constructor of Class A");
    }

    public  A(int y)
    {
        System.out.println("Constructor of Class A: " + y);
    }

    public  A(int y, String name)
    {
        System.out.println("Constructor of Class A: " + y + " & name: " + name);
    }
}
