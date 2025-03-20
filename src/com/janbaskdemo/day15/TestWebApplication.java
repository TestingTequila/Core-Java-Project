package com.janbaskdemo.day15;

public class TestWebApplication
{
    public static void main(String[] args) {
        WebApplication wa = new WebApplication("Kerrie", "Wright",22, 233242, 'f',false );
        System.out.println(wa.fName + ", " + wa.lName+ ", " + wa.age + ", " + wa.mobileNumber + ", "+ wa.gender + ", "+ wa.isMarried);

        WebApplication wap = new WebApplication("Kerrie", "Wright",22, 54645645);
        System.out.println(wap.fName + ", " + wap.lName+ ", " + wap.age + ", " + wap.mobileNumber + ", "+ wap.gender + ", "+ wap.isMarried);
        System.out.println("---------------------------------------------------------");
        WebApplication weap = new WebApplication("Kerrie.wright@janbask.com", "test@1234");
        System.out.println(weap.emailId);
        System.out.println(weap.password);
        weap.doLogin();
    }
}
