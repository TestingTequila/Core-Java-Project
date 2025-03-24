package com.janbaskdemo.day17._2thisInBuilderPattern;

public class TestECommerceWithBuilderPatternUsingNew
{
    public static void main(String[] args) {
        EcommerceWithBuilderPatternUsingNew ecommerceNew = new EcommerceWithBuilderPatternUsingNew();
        ecommerceNew.doLogin().doSearch("Samsung mobile").doAddToCart("Samsung Mobile");

    }
}
