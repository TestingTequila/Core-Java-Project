package day8;

public class MathOperationsPre
{
    //Modulo Operator
    public static void main(String[] args) {

      //I/D Operator
        //Pre Increment
        int a =1;
        int b =++a;
        System.out.println(a);//2
        System.out.println(b);//2

        int c =100;
        int d = ++c;
        System.out.println(c);//101
        System.out.println(d);//101

        int e = -99;
        int f = ++e;
        System.out.println(e);//-98
        System.out.println(f);//-98

        //Post Decrement
        int a1 =1;
        int b1 =--a1;
        System.out.println(a1);//0
        System.out.println(b1);//0

        int e1 = -99;
        int f1 = --e1;
        System.out.println(e1);//-100
        System.out.println(f1);//-100

        char g ='a';
        char h = --g;
        System.out.println(g);
        System.out.println(h);

        float i= 7.89f;
        float j = --i;
        System.out.println(i);
        System.out.println(j);



    }
}


//Post Increment/Decrement: assign and then I/D
//Pre  Increment/Decrement: I/D and then assign