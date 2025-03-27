package com.janbaskdemo.day20.InheritanceWithOverriding;

public class TestCar {
    public static void main(String[] args) {

        System.out.println("==================BMW Object==============");
        BMW bmw = new BMW();
        bmw.start(); //Inherited --Car Start from car Class
        bmw.stop(); //Inherited  --Car Stop from car Class
        bmw.refuel(); //Inherited- Car Refuel
        bmw.autoParking();// Self- BMW auto parking
        bmw.isAutomatic();//inherited from Vehicle Class [car is automatic]
//        bmw.billing(); // BMW Billing

        System.out.println("==================Car Object==============");
        Car car = new Car();
        car.start();
        car.stop();
        car.refuel();
        car.isAutomatic(); // Car is Automatic
        //car.autoParking(); Parent class cannot inherit child class property
//        car.billing(); // Car billing

        System.out.println("==================Top/DownCasting==============");

        // ParentClass refVariable= new ChildClass(); Top Casting, we use only if P-C relationship exists

        Car c1 = new BMW();// Top Casting
        c1.start(); //BMW Start
        c1.stop();  //Car Stop
        c1.refuel(); //Car Refuel
        c1.isAutomatic(); // Car is automatic
//        c1.billing();// BMW billing

        // ChildClass refVariable= new ParentClass(); Down Casting
        //BMW b1 =(BMW) new Car();//Down Casting is possible in Java a Compile time but at ru time this
        // will throw exception ClassCastException

        Vehicle vehicle = new Vehicle();
        vehicle.isAutomatic(); // Vehicle is automatic

        Vehicle v1 = new Car();
        v1.isAutomatic();

        System.out.println("=============================");

        Car car1 = new Car();
        Car.billing(); // Car Billing
        car1.billing(); // Car Billing


        System.out.println("------------------------BMW---------------");
        BMW bmw1 = new BMW();
        BMW.billing();// BMW billing
        bmw1.billing();// BMW billing

        System.out.println("-------------TOP Casting-----------------");
        Car car2= new  BMW();
        Car.billing(); //Car billing
        car2.billing(); //Car billing

        System.out.println("----------Test static name Variable-------------");

        Car car3 = new Car();
        //System.out.println(Car.name); //Jason
        System.out.println(car3.name); //Jason

        BMW bmw2 = new BMW();
        //System.out.println(BMW.name); //Roger
        System.out.println(bmw2.name); //Roger

        Car car4 = new BMW();
        //System.out.println(Car.name); //Jason
        System.out.println(car4.name); //Jason




    }
}
