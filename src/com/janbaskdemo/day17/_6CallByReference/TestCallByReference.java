package com.janbaskdemo.day17._6CallByReference;

public class TestCallByReference {
    public static void main(String[] args) {
        CallByReference cbr = new CallByReference();
        cbr.name = "Justin";
        cbr.age = 44;
        cbr.city = "New York";
        cbr.hasJob = true;
        System.out.println("Name: " + cbr.name + " Age: " + cbr.age + " City: " + cbr.city + " Has Job " + cbr.hasJob);
        cbr.myDetails(cbr);
    }
}
