package com.janbaskdemo.day12;

public class TestCompleteMaths
{
    public static void main(String[] args) {
        CompleteMaths cm = new CompleteMaths();
        cm.x=12;
        cm.y=8;
        cm.addition();//20
        cm.subtraction();//4

        cm.printName("Jason", "Roger");//JasonRoger
        cm.calculateTax();//0.3

        CompleteMaths cm1 = new CompleteMaths();
        cm1.x=122;
        cm1.y=88;
        cm1.addition();//210
        cm1.subtraction();//34
        cm1.printName("Kerrie", "Wright");//Kerrie Write
        cm.calculateTax();//0.3




    }
}
