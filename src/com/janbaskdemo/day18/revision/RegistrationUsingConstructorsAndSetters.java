package com.janbaskdemo.day18.revision;

public class RegistrationUsingConstructorsAndSetters {
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

    RegistrationUsingConstructorsAndSetters(String fName, String lName, int age, char gender, double salary, String email, String password) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.email = email;
        this.password = password;
    }

    RegistrationUsingConstructorsAndSetters(String fName, String lName, String email, String password) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
    }

    RegistrationUsingConstructorsAndSetters(int age, char gender, double salary) {
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
