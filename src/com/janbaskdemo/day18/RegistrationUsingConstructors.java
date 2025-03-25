package com.janbaskdemo.day18;

public class RegistrationUsingConstructors {
    private String fName;
    private String lName;
    private int age;
    private char gender;
    private double salary;
    private String email;
    private String password;

    RegistrationUsingConstructors(String fName, String lName, int age, char gender, double salary, String email, String password) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.email = email;
        this.password = password;
    }

    RegistrationUsingConstructors(String fName, String lName, String email, String password) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
    }

    RegistrationUsingConstructors(int age, char gender, double salary) {
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public void display() {
        System.out.println("FirstName: " + fName);
        System.out.println("LastName: " + lName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
        System.out.println("email: " + email);
        System.out.println("Password: " + password);
    }


}
