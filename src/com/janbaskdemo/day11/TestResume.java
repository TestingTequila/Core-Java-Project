package com.janbaskdemo.day11;

public class TestResume {
    public static void main(String[] args) {
        Resume resume1 = new Resume();
        resume1.firstName = "Kerrie";
        resume1.lastName = "Wright";
        resume1.age = 21;
        resume1.isMarried = false;
        resume1.profile = "Manager";

        System.out.println("==================RESUME1========================");
        System.out.println(resume1.firstName);
        System.out.println(resume1.lastName);
        System.out.println(resume1.age);
        System.out.println(resume1.isMarried);
        System.out.println(resume1.profile);

        System.out.println("==================RESUME2========================");
        Resume resume2 = new Resume();
        resume2.firstName = "John";
        resume2.lastName = "Hill";
        resume2.age = 42;
        resume2.isMarried = false;
        resume2.profile = "Director";

        System.out.println(resume2.firstName);
        System.out.println(resume2.lastName);
        System.out.println(resume2.age);
        System.out.println(resume2.isMarried);
        System.out.println(resume2.profile);

        System.out.println("==================RESUME3========================");
        Resume resume3 = new Resume();
        resume3.firstName = "Adam";
        resume3.lastName = "Pikhaver";
        resume3.age = 28;
        resume3.isMarried = true;
        resume3.profile = "Designer";

        resume3 = null;

        System.out.println(resume3.firstName);
        System.out.println(resume3.lastName);
        System.out.println(resume3.age);
        System.out.println(resume3.isMarried);
        System.out.println(resume3.profile);

        new Resume().firstName = "Rose";
        new Resume().lastName = "Natalie";
        new Resume().age=50;
        new Resume().isMarried=false;
        new Resume().profile ="Teacher";

        System.gc();

    }
}
