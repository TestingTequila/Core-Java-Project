package com.janbaskdemo.day23.ConstructorCalling;

public class D extends  C
{
    public  D()
    {
        System.out.println("Constructor of Class D ");
    }

    public  D(int x)
    {
        super("Abrar");
        System.out.println("Constructor of Class D:"+ x) ;
    }
}
