package com.janbaskdemo.day12;

public class Employee {
    String fName;
    String lName;

    float basicSalary;
    float travelAllowance;


    public  void printFullNameOfTheEmployeeOnIdCard()
    {
        String fullName =fName + lName;
        System.out.println("The name of the Employee is: " + fullName);
    }

    public  void calculateSalary()
    {
        float totalSalary=basicSalary+ travelAllowance;
        System.out.println("Salary of the Employee is: " + totalSalary);
    }


}
