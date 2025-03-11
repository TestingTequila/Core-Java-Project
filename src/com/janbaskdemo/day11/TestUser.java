package com.janbaskdemo.day11;

public class TestUser {
    public static void main(String[] args) {
        User u1 = new User();
        u1.userName = "Ravi";
        u1.age = 25;
        u1.city = "Pune";

        User u2 = new User();
        u2.userName = "Anjali";
        u2.age = 27;
        u2.city = "LA";

        User u3 = new User();
        u3.userName = "Karim";
        u3.age = 40;
        u3.city = "Karachi";

        System.out.println(u1.userName + ", " + u1.age +", " + u1.city);
        System.out.println(u2.userName + ", " + u2.age +", " + u2.city);
        System.out.println(u3.userName + ", " + u3.age +", " + u3.city);

        System.out.println("===================U1=U2======================");
        u1=u2; //u1 will break its original connection and will start pointing where u2 is pointing

        System.out.println(u1.userName + ", " + u1.age +", " + u1.city);
        System.out.println(u2.userName + ", " + u2.age +", " + u2.city);
        System.out.println(u3.userName + ", " + u3.age +", " + u3.city);

        System.out.println("===================U2=U3======================");
        u2=u3;
        System.out.println(u1.userName + ", " + u1.age +", " + u1.city);
        System.out.println(u2.userName + ", " + u2.age +", " + u2.city);
        System.out.println(u3.userName + ", " + u3.age +", " + u3.city);

        System.out.println("===================U3=U1======================");
        u3=u1;
        System.out.println(u1.userName + ", " + u1.age +", " + u1.city);
        System.out.println(u2.userName + ", " + u2.age +", " + u2.city);
        System.out.println(u3.userName + ", " + u3.age +", " + u3.city);

        System.out.println("===================U1=U2=U3======================");
        u1=u2=u3;
        System.out.println(u1.userName + ", " + u1.age +", " + u1.city);
        System.out.println(u2.userName + ", " + u2.age +", " + u2.city);
        System.out.println(u3.userName + ", " + u3.age +", " + u3.city);

    }
}
