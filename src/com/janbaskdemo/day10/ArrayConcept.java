package com.janbaskdemo.day10;

import java.util.Arrays;

public class ArrayConcept {
    public static void main(String[] args) {
        //12, 34, 56,78,89

        int x = 100;
        //System.out.println(x);

        int[] numbers = {12, 34, 56, 78, 89, 100, 67, 88, 99, 11, 22, 22, 33, 55};

        System.out.println("================WHILE LOOP================");
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        System.out.println("================FOR LOOP================");

        for (int i1 = 0; i1 < numbers.length; i1++) {
            System.out.println(numbers[i1]);

        }

        System.out.println("===================ADVANCED FOR LOOP===========");
        for (int num : numbers) {
            System.out.println(num);
        }


        System.out.println("================FOR DISPLAY==================");

        System.out.println(Arrays.toString(numbers));

        //Jason, Justin, Kerrie, Roger, Jasmine

        String name = "Jason";

        String[] students = {"Jason", "Justin", "Kerrie", "Roger", "Jasmine", "Tom"};

        System.out.println("================WHILE LOOP================");
        int j = 0;
        while (j < students.length) {
            System.out.println(students[j]);
            j++;
        }

        System.out.println("================FOR LOOP================");

        for (int j1 = 0; j1 < students.length; j1++) {
            System.out.println(students[j1]);

        }

        System.out.println("===================ADVANCED FOR LOOP===========");
        for (String stud : students) {
            System.out.println(stud);
        }

        System.out.println("================FOR DISPLAY==================");

        System.out.println(Arrays.toString(students));

    }

}
