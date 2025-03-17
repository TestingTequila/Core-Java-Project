package com.janbaskdemo.day13;

public class TestStudentMarks
{
    public static void main(String[] args) {
        StudentsMarks sm = new StudentsMarks();
        int marksScored=sm.showStudentMarks("Mabashir");
        System.out.println("The marks scored by Student is: " + marksScored);
        if(marksScored>90)
        {
            System.out.println("You are among the toppers.....");
        }
        else
        {
            System.out.println("Congratulations....you did great....");
        }
    }
}
