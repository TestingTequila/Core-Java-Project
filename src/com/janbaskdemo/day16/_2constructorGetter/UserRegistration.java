package com.janbaskdemo.day16._2constructorGetter;

public class UserRegistration {
    private String fName;
    private String lName;
    private int age;
    private boolean isFresher;
    private char gender;
    private double salary;

    public  UserRegistration(String fName, String lName,char gender, int age,boolean isFresher,double salary  )
    {
         this.fName =fName;
         this.lName=lName;
         this.age=age;
         this.gender=gender;
         this.isFresher=isFresher;
         this.salary=salary;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public boolean isFresher() {
        return isFresher;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }
}
