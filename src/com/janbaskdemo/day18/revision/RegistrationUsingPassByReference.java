package com.janbaskdemo.day18.revision;

public class RegistrationUsingPassByReference {
    private String fName;
    private String lName;
    private int age;
    private char gender;
    private double salary;
    private String email;
    private String password;

    public RegistrationUsingPassByReference setfName(String fName) {
        this.fName = fName;
        return this;
    }

    public RegistrationUsingPassByReference setlName(String lName) {
        this.lName = lName;
        return this;
    }

    public RegistrationUsingPassByReference setAge(int age) {
        this.age = age;
        return this;
    }

    public RegistrationUsingPassByReference setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public RegistrationUsingPassByReference setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public RegistrationUsingPassByReference setEmail(String email) {
        this.email = email;
        return this;
    }

    public RegistrationUsingPassByReference setPassword(String password) {
        this.password = password;
        return this;
    }

    public void updateUser(RegistrationUsingPassByReference obj) {
        obj.password = "XXX456YY";
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
