package com.janbaskdemo.day14.Overloading;

public class RealUsageOfMethodOverloading
{
    // video games
    public void action(String leftKey)
    {
        System.out.println("Actor will move to the left");
    }

    public void action(int rightKey)
    {
        System.out.println("Actor will move to the right");
    }

    public void action(String rightKey, String leftKey)
    {
        System.out.println("Actor will stand straight");
    }

    public void action(String rightKey, int number)
    {
        System.out.println("Actor will shoot");
    }

    //Login
    public  void login(String emailId, String password){

    }

    public  void login(String emailId, String password, int OTP){

    }

    public  void login(String facebookApi){

    }

    //Search operations

    public  void search(String brands)
    {

    }

    public  void search(int price)
    {

    }

    public  void search(String brands, int price)
    {

    }

    public  void search(String brands, String dealsAndDiscounts)
    {

    }

    public  void search(String brands, int price, double memory)
    {

    }

    //payments
    public void payment(long ccNumber, int cvv)
    {

    }

    public void payment(String upi)
    {

    }

    public void payment(String paypalId, String password)
    {

    }

    public void payment(String netBankId, String password, int Otp)
    {

    }
}
