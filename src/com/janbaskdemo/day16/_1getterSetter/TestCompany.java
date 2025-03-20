package com.janbaskdemo.day16._1getterSetter;

public class TestCompany {
    public static void main(String[] args) {
        Company ibm = new Company();
        ibm.setEmpFirstName("Jason");
        ibm.setEmpSalary(5000);
        System.out.println("Pay " + ibm.getEmpFirstName() + " a salary of " + "$" + ibm.getEmpSalary());

    }
}
