package day7;

public class StringConcatenation {
    public static void main(String[] args) {

        String x = "Hello";
        String y = "World";

        int a = 100;
        int b = 200;

        System.out.println(x); //Hello
        System.out.println(y); //World
        System.out.println(x + y); //HelloWorld
        System.out.println(a+b);// 300
        System.out.println(x+a); //Hello100
        System.out.println(a+b+x); //300Hello
        System.out.println(x+a+b); //Hello100200
        System.out.println(x+y+(a+b));//HelloWorld300
        System.out.println(a+b+x+y+a+b);//300HelloWorld100200
        System.out.println((a+b)+x+y+a+b);//300HelloWorld100200
        System.out.println((a+b)+x+y+(a+b)); //300HelloWorld300

    }
}
