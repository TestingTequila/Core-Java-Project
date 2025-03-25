package com.janbaskdemo.day18.revision;

public class RegistrationUsingBuilderPattern {
    private String fName;
    private String lName;
    private int age;
    private char gender;
    private double salary;
    private String email;
    private String password;

    public RegistrationUsingBuilderPattern setfName(String fName) {
        this.fName = fName;
        return this;
    }

    public RegistrationUsingBuilderPattern setlName(String lName) {
        this.lName = lName;
        return this;
    }

    public RegistrationUsingBuilderPattern setAge(int age) {
        this.age = age;
        return this;
    }

    public RegistrationUsingBuilderPattern setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public RegistrationUsingBuilderPattern setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public RegistrationUsingBuilderPattern setEmail(String email) {
        this.email = email;
        return this;
    }

    public RegistrationUsingBuilderPattern setPassword(String password) {
        this.password = password;
        return this;
    }

    public void updateUser(RegistrationUsingBuilderPattern obj) {
        obj.password = "XXX456YY";
        obj.email = "ronil.hill@microsoft.com";
    }

    public void setMyFName(String fName) {
        this.fName = fName;
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
