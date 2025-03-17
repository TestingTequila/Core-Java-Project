package com.janbaskdemo.day13;

public class StudentMarksUsingSwitch {
    public int displayStudentMarks(String studentName) {
        int marks = -1;
        switch (studentName) {
            case "Kerrie":
                marks = 65;
                break;
            case "Jason":
                marks = 90;
                break;

            case "Roger":
                marks = 80;
                break;

            case "Rose":
                marks = 93;
                break;
        }
        return marks;
    }
}
