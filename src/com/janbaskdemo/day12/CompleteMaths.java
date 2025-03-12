package com.janbaskdemo.day12;

public class CompleteMaths
{
    int x;
    int y;

    public  void addition()
    {
        int sum =x+y;
        System.out.println("ADDITION: " + sum);
    }
    public  void subtraction()
    {
        int diff =x-y;
        System.out.println("SUBTRACTION: " + diff);
    }

    public  void printName(String fName, String lName)
    {
        String fullName=fName+ lName;
        System.out.println("COMPLETE NAME: " + fullName);
    }

    public  void calculateTax()
    {
        float taxRate = 0.30f;
        System.out.println("TAX RATE: " + taxRate);
    }
}
