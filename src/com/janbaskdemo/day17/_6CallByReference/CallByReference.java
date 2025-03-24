package com.janbaskdemo.day17._6CallByReference;

public class CallByReference {

    String name;
    int age;
    String city;

    boolean hasJob;
    public void myDetails(CallByReference obj)
    {
        obj.name = "Shweta";
        obj.age =34;
        obj.city = "London";
        obj.hasJob = false;
        System.out.println("Name: " + obj.name + " Age: " + obj.age + " City: " + obj.city + " Has Job " + obj.hasJob);
    }
}
