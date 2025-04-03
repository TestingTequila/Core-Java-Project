package com.janbaskdemo.day23.StringManipulation;

import com.janbaskdemo.day10.ArrayRealTimeExample;

import java.util.Arrays;

public class StringFunctions {
    public static void main(String[] args) {
        String str = "  Hi  This      Is My Java Code  ";
        System.out.println(str.length());
        //li =0
        //hi =  str.length()-1

        //1. length();
        //2. charAt(int index);
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(8));
        //3. indexOf(char c);
        System.out.println(str.indexOf('J'));
        if (str.indexOf("Java") == 14) {
            System.out.println("this is course for Java");
        } else {
            System.out.println("Not a course of Java");
        }
        System.out.println(str.indexOf('i'));
        System.out.println(str.indexOf('i', str.indexOf('i') + 8));

        //4. toUpper
        System.out.println(str.toUpperCase().trim());
        //5. toLower
        System.out.println(str.toLowerCase().toUpperCase().trim());

        //6. trim
        System.out.println(str.trim());

        //7. replace
        System.out.println(str.replace(" ", ""));

        String dob = "25-12-1994"; // 25/12/1994
        System.out.println(dob.replace("-", "/"));
        System.out.println(dob.replace("25", "19").replace("-", "/"));

        //equals
        String s1 = "Java";
        String s2 = "java";
        System.out.println(s1.toUpperCase().equals(s2.toUpperCase()));

        //contains
        System.out.println(str.contains("Python"));

        //split ---> converts into String Array

        String thoughtOfTheDay = "Either you agree with me or be in doubt";
        System.out.println(thoughtOfTheDay.length()); //39
        String[] myWords =thoughtOfTheDay.split(" ");
        System.out.println(myWords.length); //9
        System.out.println(Arrays.toString(myWords));
        for(int i=0; i<myWords.length; i++)
        {
            if(myWords[i].equals("agree")) {
                System.out.println(myWords[i]);
                break;

            }
            else
            {
                System.out.println("This is not having the word i need");
            }

        }

        String programmingLanguage = "JavaScript_CSharp_Python_Java_OObjective";
        String[] programs=programmingLanguage.split("_");
        System.out.println(programs.length);//5
        System.out.println(Arrays.toString(programs));//

        String pop ="xXtestingxXseleniumXxXautomationXXxXTrainingxX";
        String[] words=pop.split("xX");
        System.out.println(words.length);
        System.out.println(Arrays.toString(words));

        char[] letters=thoughtOfTheDay.toCharArray();
        System.out.println(Arrays.toString(letters));


        String s = "                            This is Java  ";
        System.out.println(s);
        System.out.println(s.trim());



    }

}
