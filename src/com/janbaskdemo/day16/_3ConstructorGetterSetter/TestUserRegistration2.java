package com.janbaskdemo.day16._3ConstructorGetterSetter;

public class TestUserRegistration2 {
    public static void main(String[] args) {
        UserRegistration2 user2 = new UserRegistration2("Lily", "Hill", 'f', 23, false, 6000.00);
        System.out.println(user2.getfName());
        System.out.println(user2.getlName());
        System.out.println(user2.getGender());
        System.out.println(user2.getAge());
        System.out.println(user2.isFresher());
        System.out.println(user2.getSalary());

        System.out.println("======Update the name and print rest of the details=============");
        user2.setfName("Rose");
        System.out.println(user2.getfName());
        System.out.println(user2.getlName());
        System.out.println(user2.getGender());
        System.out.println(user2.getAge());
        System.out.println(user2.isFresher());
        System.out.println(user2.getSalary());

    }
}
