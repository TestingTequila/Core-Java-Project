package com.janbaskdemo.day15;

public class ConstructorOverloading
{
    int productPrice;
    String productName;
    double memoryStorage;
    public ConstructorOverloading()
    {
        System.out.println("Default Constructor");
    }

    public ConstructorOverloading(int productPrice)
    {
        this.productPrice = productPrice;
    }

    public ConstructorOverloading(int productPrice,String productName )
    {
        this.productPrice = productPrice;
        this.productName = productName;
    }

    public ConstructorOverloading(int productPrice,String productName,double memoryStorage )
    {
        this.productPrice = productPrice;
        this.productName = productName;
        this.memoryStorage = memoryStorage;
    }

    public ConstructorOverloading(int productPrice,double memoryStorage )
    {
        this.productPrice = productPrice;
        this.memoryStorage = memoryStorage;
    }
}
