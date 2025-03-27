package com.janbaskdemo.day20.InheritanceWithOverriding;

public class BMW extends Car {
    static String  name = "Roger";
    public void autoParking() {
        System.out.println("BMW auto parking");
    }

    @Override
    public  void start()
    {
        System.out.println("BMW Start.........");
    }

    @Override
    public final void isAutomatic()
    {
        System.out.println("BMW  Is Automatic....");
    }

//    public static void billing()
//    {
//        System.out.println("BMW billing...");
//    }
}
