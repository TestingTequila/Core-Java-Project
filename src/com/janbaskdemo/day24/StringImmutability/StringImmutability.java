package com.janbaskdemo.day24.StringImmutability;

public class StringImmutability {
    public static void main(String[] args) {
        String s = "           This is Java Session       ";
        System.out.println(s); // THis is printing with space
        s.trim();  //This is Java Session
        System.out.println(s); // THis is printing with space

        String name = "Jason";
        String newName = name.concat(" Roger");
        System.out.println(name);
        System.out.println(newName);

        String myName = "Jason"; //String literals
        String str = new String("Kerrie");
        str.concat(" Wright");
        System.out.println(str);


    }

}
