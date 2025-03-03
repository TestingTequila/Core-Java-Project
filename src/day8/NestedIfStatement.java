package day8;

public class NestedIfStatement
{
    public static void main(String[] args) {
        //WAP to identify if the person is eligible to vote if s/he is above 18 and he they carry
        // voter Id card, they can vote...
        int age =19;
        boolean hasIdCard = false;
        if(age>=18)
        {
            System.out.println("The person is eligible to Vote..");
            if(hasIdCard)
            {
                System.out.println("S/He can go and Cast their vote...");
            }
        }
    }
}
