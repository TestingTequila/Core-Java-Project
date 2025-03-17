package com.janbaskdemo.day13;

public class TestStudentMarksUsingSwitch
{
    public static void main(String[] args) {
        StudentMarksUsingSwitch studentMarksUsingSwitch = new StudentMarksUsingSwitch();
        int marks =studentMarksUsingSwitch.displayStudentMarks("Ashish");
        System.out.println("Marks scored by student is: " + marks);
    }
}
