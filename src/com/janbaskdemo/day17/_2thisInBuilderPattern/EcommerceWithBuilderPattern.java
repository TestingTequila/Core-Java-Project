package com.janbaskdemo.day17._2thisInBuilderPattern;

public class EcommerceWithBuilderPattern {
    public EcommerceWithBuilderPattern doLogin() {
        System.out.println("Login to app");
        return this;
    }

    public EcommerceWithBuilderPattern doLogin(String un, String pwd) {
        System.out.println("Login to app using " + un + ", " + pwd);
        return  this;
    }

    public EcommerceWithBuilderPattern doSearch(String product) {
        System.out.println("Searching the product: " + product);
        return  this;
    }

    public EcommerceWithBuilderPattern doSearch(String product, double price) {
        System.out.println("Searching the product: " + product + " with a price of :" + price);
        return  this;
    }

    public EcommerceWithBuilderPattern doSearch(String product, String brand) {
        System.out.println("Searching the product: " + product + " with a Brand of :" + brand);
        return  this;
    }

    public EcommerceWithBuilderPattern doAddToCart(String product) {
        System.out.println("Adding the product: " + product + " to Card: ");
        return  this;
    }

    public EcommerceWithBuilderPattern doPayment(long ccNumber, int cvv) {
        System.out.println("Paying for product using Credit card details as " + ccNumber + " and CVV number as:" + cvv);
        return  this;
    }

    public EcommerceWithBuilderPattern doPayment(String payPal) {
        System.out.println("Paying for product using Paypal " + payPal);
        return  this;
    }

    public EcommerceWithBuilderPattern generateOrder(String orderId) {
        System.out.println("Your Order Id Is: " + orderId);
        return  this;
    }

    public EcommerceWithBuilderPattern doLogout() {
        System.out.println("Logging out from the application....");
        return  this;
    }
}
