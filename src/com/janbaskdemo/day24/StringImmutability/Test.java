package com.janbaskdemo.day24.StringImmutability;

public class Test {
    public static void main(String[] args) {
        String s1 = "Ashish";
        String s2 = "Ashish";
        String s3 = new String("Ashish");
        String s4 = new String("Ashish");
        System.out.println("s1 Memory Address:   " + System.identityHashCode(s1));
        System.out.println("s2 Memory Address:   " + System.identityHashCode(s2));
        System.out.println("s3 Memory Address:   " + System.identityHashCode(s3));
        System.out.println("s4 Memory Address:   " + System.identityHashCode(s4));
        System.out.println(s1.hashCode()==s3.hashCode());
    }
}
