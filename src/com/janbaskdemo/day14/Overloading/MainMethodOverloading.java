package com.janbaskdemo.day14.Overloading;

public class MainMethodOverloading
{
    public static void main(String[] args) {
        System.out.println("Inside default main method.......");
    }

    public static void main(String[] args, int a) {

        System.out.println("inside main with string array and int parameter");
    }

    public static void main(String[] args, char a) {
        System.out.println("inside main with string array and char parameter");
    }

    public static void main(char a, String[] args) {
        System.out.println("inside main with int  and String array parameter");
    }

    public static void main(char a, String[] args, boolean b) {
        System.out.println("inside main with string array and char parameter and boolean" );
    }
}
