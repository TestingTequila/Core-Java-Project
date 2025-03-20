package com.janbaskdemo.day16._1getterSetter;

public class Company {
    private String empFirstName;
    private double empSalary;
    public void setEmpFirstName(String empFirstName) {
        String[] employeesName = {"Jason", "Kerrie", "John"};
        for (String emp : employeesName) {
            if (emp.contains(empFirstName)) {
                this.empFirstName = empFirstName;
                break;
            } else {
                this.empFirstName = "N/A";
            }
        }
    }
    public void setEmpSalary(double empSalary) {
        if (empSalary > 1000 && empSalary <= 10000) {
            this.empSalary = empSalary;
        } else {
            this.empSalary = 0.0;
        }
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public double getEmpSalary() {
        return empSalary;
    }
}
