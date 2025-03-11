package com.janbaskdemo.day8;

public class SampleProblemID {

    public static void main(String[] args) {
        int m = 200;
        int n = m++;
        System.out.println(--m);//200
        System.out.println(m);//200
        System.out.println(m++);//200
        System.out.println(m--);//201
        System.out.println(--m);//199
        System.out.println(m);//199
    }


}
