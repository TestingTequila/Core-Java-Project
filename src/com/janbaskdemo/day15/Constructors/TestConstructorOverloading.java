package com.janbaskdemo.day15.Constructors;

public class TestConstructorOverloading
{
    public static void main(String[] args) {
        ConstructorOverloading co = new ConstructorOverloading();
        System.out.println(co.productName);
        System.out.println(co.productPrice);
        System.out.println(co.memoryStorage);

        System.out.println("=====================================");

        ConstructorOverloading coo = new ConstructorOverloading(6000);
        System.out.println(coo.productName);//null
        System.out.println(coo.productPrice);//6000
        System.out.println(coo.memoryStorage);//0.0

        System.out.println("=====================================");

        ConstructorOverloading c = new ConstructorOverloading(8000, "Samsung");
        System.out.println(c.productName);//Samsung
        System.out.println(c.productPrice);//8000
        System.out.println(c.memoryStorage);//0.0

        System.out.println("=====================================");

        ConstructorOverloading c1 = new ConstructorOverloading(8000, "Samsung", 256);
        System.out.println(c1.productName);//Samsung
        System.out.println(c1.productPrice);//8000
        System.out.println(c1.memoryStorage);//0.0
    }
}
