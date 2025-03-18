package com.janbaskdemo.day14.Static;

public class TestCar {
    public static void main(String[] args) {

        System.out.println("==================Car BMW Details=============");
        Car c1 = new Car();
        c1.name = "BMW";
        c1.price = 6000.456;
        c1.color = "Red";
        c1.stop("BMW");
        Car.start();
        System.out.println("Car Name: "+c1.name);
        System.out.println("Car Price: "+c1.price);
        System.out.println("Car Color: "+c1.color);
        System.out.println("Car Wheels: "+Car.wheels);

        System.out.println("==================Car Audi Details=============");
        Car c2 = new Car();
        c2.name= "Audi";
        c2.price = 45678.98;
        c2.color ="White";
        c2.stop("Audi");
        Car.start();
        System.out.println("Car Name: "+c2.name);
        System.out.println("Car Price: "+c2.price);
        System.out.println("Car Color: "+c2.color);
        System.out.println("Car Wheels: "+Car.wheels);

        System.out.println("==================Car Tesla Details=============");

        Car c3=new Car();
        c3.name = "Tesla";
        c3.price =40768.65;
        c3.color = "Blue";
        c3.stop("Tesla");
        Car.start();
        System.out.println("Car Name: "+c3.name);
        System.out.println("Car Price: "+c3.price);
        System.out.println("Car Color: "+c3.color);
        System.out.println("Car Wheels: "+Car.wheels);
    }
}
