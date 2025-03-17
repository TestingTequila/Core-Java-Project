package com.janbaskdemo.day13;

public class TestEmployeeSalary
{
    public static void main(String[] args) {
        EmployeeSalary es = new EmployeeSalary();
        double totalSalary =es.calculateSalary(6000, 4000); //$10000
        System.out.println("Salary Before Bonus: $" + totalSalary);

        double finalSalaryWithBonus =totalSalary + 1000;
        System.out.println("Final Salary Paid To Employee with Bonus : $" + finalSalaryWithBonus);
    }
}
