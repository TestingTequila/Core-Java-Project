package com.janbaskdemo.day17._2thisInBuilderPattern;

public class TestECommerceWithBuilderPattern {
    public static void main(String[] args) {
        EcommerceWithBuilderPattern ecomm = new EcommerceWithBuilderPattern();
        ecomm.doLogin("jason.roger@janbask.com", "test@1234");
        ecomm.doSearch("Iphone", 3534634.67);
        ecomm.doAddToCart("Iphone");
        ecomm.doPayment("jason.roger@paypal.com");
        ecomm.generateOrder("3123GFD45");
        ecomm.doLogout();

        System.out.println("==========Calling Methods using Builder Pattern===========");
        EcommerceWithBuilderPattern eCommerce = new EcommerceWithBuilderPattern();
        eCommerce.doLogin("ben.fletcher@janbask.com", "test@1234").
                doSearch("Ipad", 342432.45).
                doPayment(5353534535L, 435).
                generateOrder("$%TR%6").
                doLogout();
        eCommerce.doLogin().doSearch("Laptop").doLogout();
        eCommerce.doSearch("Laptop", "Apple").doAddToCart("Laptop").doLogout();
        eCommerce.doPayment("tom.hill@payal.com");

    }
}
