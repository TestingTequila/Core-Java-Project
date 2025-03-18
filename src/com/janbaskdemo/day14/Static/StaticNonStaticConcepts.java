package com.janbaskdemo.day14.Static;

public class StaticNonStaticConcepts
{
    static int staticInteger;
    static String staticString;

     int nonStaticInteger;
     String nonStaticString;

     public  void nonStaticM1()
     {
         System.out.println("nonStaticM1");
         nonStaticM2();
         nonStaticInteger= 34;
     }

    public  void nonStaticM2()
    {
        System.out.println("nonStaticM2");
        StaticNonStaticConcepts.staticInteger=90;
    }

    public  void nonStaticM3()
    {
        System.out.println("nonStaticM3");
        StaticNonStaticConcepts.staticM3();
    }

    public static void staticM1()
    {
        System.out.println("staticM1");
        staticM2();
    }

    public static void staticM2()
    {
        System.out.println("staticM2");
        staticString="Roger";

    }

    public static void staticM3()
    {
        System.out.println("staticM3");
        StaticNonStaticConcepts obj1 = new StaticNonStaticConcepts();
        obj1.nonStaticString = "Kerrie";
        obj1.nonStaticM2();



    }
}
