package com.janbaskdemo.day20.InheritanceWithOverriding;

public class Car extends Vehicle {

    String  name = "Jason";
    public void start() {
        System.out.println("Car Start.........");
    }

    public void stop() {
        System.out.println("Car Stop.....");
    }

    public void refuel() {
        System.out.println("Car Refuel....");
    }

    public static final void billing()
    {
        System.out.println("Car billing...");
    }


    //Cannot override a final method
//    public  void isAutomatic()
//    {
//        System.out.println("Car Is Automatic....");
//    }


}

