package com.janbaskdemo.day20.Misc;

public class Test {
    public static void main(String[] args) {
        Misc misc = new Misc();
        misc.m1(10);
        misc.m1("Jason");

        C c = new C();
        c.m1(10);
        c.m1("Jason");

        System.out.println("=================Top Casting=======");
         Misc misc1= new C();
         misc1.m1(10);
         misc1.m1("Jason");
    }
}
