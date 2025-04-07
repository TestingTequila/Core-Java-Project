package com.janbaskdemo.day25;

public class TestApplicationException
{

    public static void main(String[] args) {
        String date = null;
        if(date ==null)
        {
            throw new ApplicationException("This is my own Exception message for null Pointer...");
        }
    }
}
