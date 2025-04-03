package com.janbaskdemo.day24.Collection;

import java.util.Arrays;

public class ArraysConcepts
{
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));
        for(int i=0; i<=numbers.length; i++)
        {
            System.out.println(numbers[i]); //0, 0, 0, 0, 0,
        }
    }
}
