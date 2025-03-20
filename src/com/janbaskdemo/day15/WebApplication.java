package com.janbaskdemo.day15;

public class WebApplication {
    String fName;
    String lName;
    int age;
    long mobileNumber;
    char gender;
    boolean isMarried;

    String emailId;
    String password;

    public WebApplication() {
        System.out.println("WebApplication Default Constructor");
    }

    public WebApplication(String fName, String lName, int age, long mobileNumber, char gender, boolean isMarried) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
        this.isMarried = isMarried;
    }

    public WebApplication(String fName, String lName, int age, long mobileNumber) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }

    public  WebApplication(String emailId, String password)
    {
        this.emailId = emailId;
        this.password=password;
    }

    public  void doLogin()
    {
        System.out.println("Enter the emailId:" + emailId);
        System.out.println("Enter the password: " + password);
        System.out.println("Click on Login Button");
        System.out.println("Login is successful");
    }


}
