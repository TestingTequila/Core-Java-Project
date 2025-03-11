package com.janbaskdemo.day8;

public class MathOperations
{
    //Modulo Operator
    public static void main(String[] args) {
        //Modulo Operator [Remainder]

        //System.out.println(10%3);

      //I/D Operator
        //Post Increment
        int a =1;
        int b =a++;
        System.out.println(a);//2
        System.out.println(b);//1

        int c =100;
        int d = c++;
        System.out.println(c);//101
        System.out.println(d);//100

        int e = -99;
        int f = e++;
        System.out.println(e);//-98
        System.out.println(f);//-99

        //Post Decrement
        int a1 =1;
        int b1 =a1--;
        System.out.println(a1);//0
        System.out.println(b1);//1

        int e1 = -99;
        int f1 = e1--;
        System.out.println(e1);//-100
        System.out.println(f1);//-99

        char g ='a';
        char h = g--;
        System.out.println(g);
        System.out.println(h);



    }
}
