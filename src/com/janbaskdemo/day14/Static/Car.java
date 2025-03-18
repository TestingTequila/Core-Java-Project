package com.janbaskdemo.day14.Static;

public class Car
{
    String name;
    double price;
    String color;
    final static int wheels=4;

    public static void  start()
    {
        System.out.println("Automatic Car Start");
    }

    public void  stop(String carName)
    {
        System.out.println("Car Stop" + carName);
    }
}
