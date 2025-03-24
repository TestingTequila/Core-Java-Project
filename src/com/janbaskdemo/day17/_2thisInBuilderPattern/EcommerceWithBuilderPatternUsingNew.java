package com.janbaskdemo.day17._2thisInBuilderPattern;

public class EcommerceWithBuilderPatternUsingNew {
    public EcommerceWithBuilderPatternUsingNew doLogin() {
        System.out.println("Login to app");
        return new EcommerceWithBuilderPatternUsingNew();
    }

    public EcommerceWithBuilderPatternUsingNew doLogin(String un, String pwd) {
        System.out.println("Login to app using " + un + ", " + pwd);
        return new EcommerceWithBuilderPatternUsingNew();
    }

    public EcommerceWithBuilderPatternUsingNew doSearch(String product) {
        System.out.println("Searching the product: " + product);
        return new EcommerceWithBuilderPatternUsingNew();
    }

    public EcommerceWithBuilderPatternUsingNew doSearch(String product, double price) {
        System.out.println("Searching the product: " + product + " with a price of :" + price);
        return new EcommerceWithBuilderPatternUsingNew();
    }

    public EcommerceWithBuilderPatternUsingNew doSearch(String product, String brand) {
        System.out.println("Searching the product: " + product + " with a Brand of :" + brand);
        return new EcommerceWithBuilderPatternUsingNew();
    }

    public EcommerceWithBuilderPatternUsingNew doAddToCart(String product) {
        System.out.println("Adding the product: " + product + " to Card: ");
        return new EcommerceWithBuilderPatternUsingNew();
    }

    public EcommerceWithBuilderPatternUsingNew doPayment(long ccNumber, int cvv) {
        System.out.println("Paying for product using Credit card details as " + ccNumber + " and CVV number as:" + cvv);
        return new EcommerceWithBuilderPatternUsingNew();
    }

    public EcommerceWithBuilderPatternUsingNew doPayment(String payPal) {
        System.out.println("Paying for product using Paypal " + payPal);
        return new EcommerceWithBuilderPatternUsingNew();
    }

    public EcommerceWithBuilderPatternUsingNew generateOrder(String orderId) {
        System.out.println("Your Order Id Is: " + orderId);
        return new EcommerceWithBuilderPatternUsingNew();
    }

    public EcommerceWithBuilderPatternUsingNew doLogout() {
        System.out.println("Logging out from the application....");
        return new EcommerceWithBuilderPatternUsingNew();
    }
}
