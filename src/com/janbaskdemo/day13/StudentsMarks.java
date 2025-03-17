package com.janbaskdemo.day13;

public class StudentsMarks
{
    //Give the name of the Student, and I should get the marks scored by the student

    public  int showStudentMarks(String studentName)
    {
        int marks=-1;

        if(studentName.equals("Kerrie"))
        {
            marks= 65;
        }
        else if (studentName.equals("Jason"))
        {
            marks= 90;
        }
        else if (studentName.equals("Roger"))
        {
            marks= 80;
        }
        else if (studentName.equals("Rose"))
        {
            marks= 93;
        }
            return marks;
    }
}
