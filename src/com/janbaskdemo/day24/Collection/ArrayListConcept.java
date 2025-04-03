package com.janbaskdemo.day24.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list);
        list.add(12);
        list.add(44);
        list.add(67);
        list.add(98);
        list.add(100);
        list.add(7);
        list.add(3);
        list.add(39);
        list.add(55);
        list.add(100);
        list.add(99);
        System.out.println(list);

        //We can use ArrayList to store dynamic values
        //We can use ArrayList when we want to maintain order
        //We can hold duplicate values in ArrayList

        System.out.println("==============Top Casting=========================");

        List<Integer> list1 = new ArrayList<Integer>();
        System.out.println(list1);
        list1.add(12);
        list1.add(44);
        list1.add(67);
        list1.add(98);
        list1.add(100);
        list1.add(7);
        list1.add(3);
        list1.add(39);
        list1.add(55);
        list1.add(100);
        list1.add(99);
        System.out.println("BEFORE SORTING: "+list1);
        Collections.sort(list1);
        System.out.println("AFTER SORTING: "+list1);
        Collections.reverse(list1);
        System.out.println("AFTER REVERSING: "+list1);


    }
}
