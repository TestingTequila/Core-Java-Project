package com.janbaskdemo.day25;

public class TryWithFinallyOnly
{
    public static void main(String[] args) {
        int x =9;
        int y =0;
        int divide=0;
        try {
             divide = x/y;
        }
        finally {
            System.out.println("Finally block will always execute");
        }
        System.out.println("divide: " + divide);
    }


}
