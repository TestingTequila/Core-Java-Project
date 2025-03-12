package com.janbaskdemo.day12;

public class TestEmployee
{
    public static void main(String[] args) {
       Employee emp = new Employee();
       emp.fName="Allison ";
       emp.lName ="Daver";
       emp.printFullNameOfTheEmployeeOnIdCard();
       emp.basicSalary =5000;
       emp.travelAllowance= 3000;
       emp.calculateSalary();
    }
}
