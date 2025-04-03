package com.janbaskdemo.day24.StringImmutability;

public class EqualsForStringComparison {
    public static void main(String[] args) {
        String str = "Selenium";
        String str1 = "Selenium";
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str == str1); //[==] this does not compare the String values, this compares the String Address
        String str2 = "selenium";

        String s3 = "testing";
        String s4 = "testing";

        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s3 == s4);//[==] this does not compare the String values, this compares the String Address

        String x = new String("Java");
        String s1 = new String("testing");

        System.out.println(s1.hashCode());

        System.out.println(s4 == s1);
        System.out.println(s4.equals(s1));

        String s2 = new String("testing");
        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2));//true

    }
}
