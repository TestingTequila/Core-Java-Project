package com.janbaskdemo.day17._3thisInConstructorCallling;

public class ConstructorsCalling
{
    String name;
    String city;
    int age;
   public ConstructorsCalling(String name, int age)
    {
        this(name);
        System.out.println("Constructor calling with city name as :" + name + " and with pinCode as " + age);
    }

    public ConstructorsCalling(String name, int age, String city)
    {
        this("Brisbane", 100);
        System.out.println("Constructor calling with name as :" + name + " and with age as " + age + " and city as: " + city);
    }

    public ConstructorsCalling(String name)
    {
        this(34);
        System.out.println("Constructor calling with name as :" + name);
    }

    public ConstructorsCalling(String city, byte pinCode)
    {
        this(34);
        System.out.println("Constructor calling with name as :" + city + " and pin code as " + pinCode);
    }

    public ConstructorsCalling(int  age)
    {
        System.out.println("Constructor calling with age as :" + age);
    }


}
