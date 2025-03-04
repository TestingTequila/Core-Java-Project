package day9;

public class forLoop {
    public static void main(String[] args) {


        for (int num = 1; num <= 10; num++) {
            System.out.println("This is Java Class");

        }

        System.out.println("================Using While Loop================");
        //WAP to print the numbers from 1-10


        for (int number = 1; number <= 10; number++) {
            System.out.println(number);//1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        }

        System.out.println("======WAP to print the numbers from 10 to 1====");


        for (int myNumber = 10; myNumber > 0; myNumber--) {
            System.out.println(myNumber);//10, 9, 8....1

        }

        System.out.println("=====WAP to print the table of 2============");

        for (int thisNumber = 1; thisNumber <= 10; thisNumber++) {
            System.out.println(thisNumber * 2);//2, 4,6.....20

        }

        //WAP to print the numbers from 1 to 100, except the numbers which are divisible by 5


        for (int newNumber = 1; newNumber <= 100; newNumber++) {
            if (!(newNumber % 5 == 0)) {
                System.out.println(newNumber);
            }

        }

        for (; true; ) {
            System.out.println("This is Hilton Hotel...");
        }

    }
}

//While loop:
   //when number of iterations is not fixed