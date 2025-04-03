package com.janbaskdemo.day24.StringMutability;

public class StringBufferConcept {
    public static void main(String[] args) {
        System.out.println("===============String Buffer=====================");
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Course");
        System.out.println(sb);


        System.out.println("===============String=====================");
        String sb1 = new String("Java");
        sb1.concat(" Course");
        System.out.println(sb1);
    }
}
