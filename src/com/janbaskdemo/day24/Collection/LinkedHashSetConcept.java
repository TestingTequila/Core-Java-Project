package com.janbaskdemo.day24.Collection;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetConcept
{
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();
        System.out.println(set);
        set.add("Jason");
        set.add("Roger");
        set.add("Kerrie");
        set.add("Pavani");
        set.add("Azfar");
        set.add("Jason");
        set.add("Roger");


        System.out.println(set);

        System.out.println("===Top Casting================");

        Set<String> set1 = new LinkedHashSet<>();
        System.out.println(set1);
        set1.add("Jason");
        set1.add("Roger");
        set1.add("Kerrie");
        set1.add("Pavani");
        set1.add("Azfar");
        set1.add("Jason");
        set1.add("Jason");
        set1.add("Jason");
        set1.add("Jason");
        set1.add("Roger");

        System.out.println(set1);
    }
}


//We can use LinkedHashSet to add Dynamic Values
//WE can use LinkedHashSet when we  want to preserve the order
//WE can use LinkedHashSet when we don't want to have duplicate value