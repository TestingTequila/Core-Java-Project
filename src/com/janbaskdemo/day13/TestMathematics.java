package com.janbaskdemo.day13;

public class TestMathematics
{
    public static void main(String[] args) {
        Mathematics maths = new Mathematics();
        //int total1 = maths.addition1(12,8); //void

        int total2= maths.addition2(12,8); //int
        int finalTotal=total2*5;//40
        System.out.println(finalTotal);//40
    }
}

//apartFromVoid ---> return ---> returnSomethingWhichIsSameAsReturnTypeUsedInYourMethod