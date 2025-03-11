package com.janbaskdemo.day7;

public class MathsOperations {
    public static void main(String[] args) {

        //1. I/I = I part
        System.out.println(12 / 6);//2
        System.out.println(12 / 3);//4
        System.out.println(12 / 5); //2.4

        //2. I/Decimal or Decimal/I or Decimal/Decimal = the actual result
        System.out.println(9.0 / 2); //4.5
        System.out.println(9 / 2.0); //4.5
        System.out.println(9.0 / 2.0); //4.5

        int a = 10;
        int b = 2;
        int c = 3;
        int divide = a / c;
        double div = a / c;
        System.out.println(a / c); //3
        System.out.println(divide);//3
        System.out.println(div); //3.0

        //3. I/0 = ?
        //System.out.println(10/0); //AE

        //4. Decimal/0or 0.0, Integer/0.0 = Infinity
        System.out.println(9.0/0);//infinity
        System.out.println(9.0/0.0);//infinity
        System.out.println(9/0.0); //infinity
        System.out.println(9/0); //AE
    }
}
