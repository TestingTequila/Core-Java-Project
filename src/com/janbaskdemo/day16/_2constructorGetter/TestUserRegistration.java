package com.janbaskdemo.day16._2constructorGetter;

public class TestUserRegistration {
    public static void main(String[] args) {
        UserRegistration user1 = new UserRegistration("Lily", "Hill", 'f', 23, false, 6000.00);
        System.out.println(user1.getfName());
        System.out.println(user1.getlName());
        System.out.println(user1.getGender());
        System.out.println(user1.getAge());
        System.out.println(user1.isFresher());
        System.out.println(user1.getSalary());
    }
}
