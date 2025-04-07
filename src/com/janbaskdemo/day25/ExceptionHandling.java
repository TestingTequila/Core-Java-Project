package com.janbaskdemo.day25;

public class ExceptionHandling {
    public static void main(String[] args) {

        int x = 9;
        int y = 0;
        int divide = 0;
        String name=null;
        int[] numbers = new int[]{12,34,56,67,78};
        try
        {
            System.out.println(numbers[4]);// AIOBE
            System.out.println(name.toLowerCase());//NPE
            divide = x / y;//AE
        }
        catch (Error e)
        {
            e.printStackTrace();
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

        catch (Throwable th)
        {
            th.printStackTrace();
        }

        System.out.println("Divide: " + divide);
        System.out.println("This is Exception Handling Class....");


    }
}


//1. What is compile time error [int x =12.33]
//2. What is Run Time Error     [stack Overflow error]
//3. What do we mean by Exception handling: If an error occurred at any point in your code, this
//   should not stop execution of following lines of code
//4. We handle such exception/errors using try-catch block
//5. try block cannot exist all alone
//6. Difference b/w Exception and Error[int x =12.33 // stack Overflow error]
//7. Exception specific class should be used in catch block parameter[Arithmatic/NP/AIOBE...etc]
//8. Use of multiple Catch blocks
//9. Parent-Child Exception Handling [If parent is handling, no further catch child block]
//10. finally block
//11. tryCatchFinally with catch handling some other exception than what is thrown- [int x =12.33], catch(NPE)-->Not an Exception Handling
//12. tryWithFinally only: Can exist, but this isn't Exception Handling
//13. throws Concept: This is ideally not handling the Exception, passing the ball
//14. throw: This is used to create its own custom exception
//     Create a class
//     Inherit RunTimeException class into this Class
//     Create a constructor of the class
//     Call the Parent class constructor into this class using super keyword
//     Test your customized Exception

