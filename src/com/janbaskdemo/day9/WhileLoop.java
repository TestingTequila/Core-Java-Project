package com.janbaskdemo.day9;

public class WhileLoop
{
    public static void main(String[] args) {
        
        int num =1;
        while (num<=10)
        {
            System.out.println("This is Java Class");
            num++;
        }

        System.out.println("================Using While Loop================");
        //WAP to print the numbers from 1-10

         int number=1;
         while (number<=10)
         {
             System.out.println(number);//1, 2, 3, 4, 5, 6, 7, 8, 9, 10
             number++;
         }

        System.out.println("======WAP to print the numbers from 10 to 1====");

         int myNumber= 10;
         while (myNumber>0)
         {
             System.out.println(myNumber);//10, 9, 8....1
             myNumber--;
         }

        System.out.println("=====WAP to print the table of 2============");
         int thisNumber =1;
         while (thisNumber<=10)
         {
             System.out.println(thisNumber*2);//2, 4,6.....20
             thisNumber++;
         }


//         while (true)
//         {
//             System.out.println("This is Hilton Hotel...");
//         }

         //WAP to print the numbers from 1 to 100, except the numbers which are divisible by 5

        int newNumber =1;
        while (newNumber<=100)
        {
            if(!(newNumber%5==0))
            {
                System.out.println(newNumber);
            }
            newNumber++;
        }

    }
}
