package com.janbaskdemo.day13;

public class EmployeeSalary
{
    //Every employee will be paid a bonus of $1000 apart from the salary
    //Salary
    //Basic Salary + Travelling Allowance

    public  double calculateSalary(double basicSalary,double travelAllowance )
    {
       double totalSalary= basicSalary + travelAllowance;
       return totalSalary;
    }


}
