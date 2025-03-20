package com.janbaskdemo.day16._3ConstructorGetterSetter;

public class UserRegistration2 {
    private String fName;
    private String lName;
    private int age;
    private boolean isFresher;
    private char gender;
    private double salary;

    public UserRegistration2(String fName, String lName, char gender, int age, boolean isFresher, double salary  )
    {
         this.fName =fName;
         this.lName=lName;
         this.age=age;
         this.gender=gender;
         this.isFresher=isFresher;
         this.salary=salary;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFresher(boolean fresher) {
        isFresher = fresher;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
