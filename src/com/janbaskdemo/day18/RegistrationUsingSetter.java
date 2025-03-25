package com.janbaskdemo.day18;

public class RegistrationUsingSetter {
    private String fName;
    private String lName;
    private int age;
    private char gender;
    private double salary;
    private String email;
    private String password;

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
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
