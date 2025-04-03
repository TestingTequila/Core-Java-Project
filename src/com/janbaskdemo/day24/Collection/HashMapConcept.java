package com.janbaskdemo.day24.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapConcept {
    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        System.out.println(phoneBook);
        phoneBook.put("Jason", 45345);
        phoneBook.put("Ashish", 678585);
        phoneBook.put("Mobashar", 64564);
        phoneBook.put("Kerrie", 7657575);
        phoneBook.put("Tony", 654563);
        phoneBook.put("Mobashar", 34565654);
        System.out.println(phoneBook);
        System.out.println("================TOP CASTING==============");

        Map<String, Integer> phonebook = new HashMap<>();
        System.out.println(phonebook);
        phonebook.put("Jason", 45345);
        phonebook.put("Ashish", 678585);
        phonebook.put("Mobashar", 64564);
        phonebook.put("Kerrie", 7657575);
        phonebook.put("Tony", 654563);
        phonebook.put("Mobashar", 34565654);
        phonebook.put("0", 987970000);
        System.out.println(phonebook);

        System.out.println("KEYS: "+phonebook.keySet());
        System.out.println("VALUES: " + phonebook.values());
        System.out.println(phonebook.get("Ashish"));
        Set<String> customerNames =phonebook.keySet();
        for(String c: customerNames)
        {
            System.out.println(c);
        }

        System.out.println(customerNames);
    }
}
// HashMap can be used to hold Dynamic values
// HashMap, order is not maintained
// HashMap, Not add duplicate values