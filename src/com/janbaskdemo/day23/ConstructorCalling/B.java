package com.janbaskdemo.day23.ConstructorCalling;

public class B extends A {
    public B() {
        super(120, "Roger");
        System.out.println("Constructor of Class B");
    }

    public B(int a) {
        super(12,"Jason");
        System.out.println("Constructor of Class B: " + a);
    }
}


//It's the responsibility of child class constructor/s to call the parent class Constructor
//If we have to call Default constructor of Parent class, need not worry, both parametrized or non-parametrized
// Constructor of Child class will call the default constructor of Parent Class automatically BUT if we have to
// call the parametrized constructor of a Parent class, in that case, every child class constructor should call
// the parent class Parametrized Constructor using 'super' keyword