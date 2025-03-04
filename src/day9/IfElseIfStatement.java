package day9;

public class IfElseIfStatement
{
    public static void main(String[] args) {
        int dayOfTheWeek=7;
        if(dayOfTheWeek==1)
        {
            System.out.println("Its Monday");
        }
        else if (dayOfTheWeek==2)
        {
            System.out.println("Its Tuesday");
        }
        else if (dayOfTheWeek==3)
        {
            System.out.println("Its Wednesday");
        }
        else if (dayOfTheWeek==4)
        {
            System.out.println("Its Thursday");
        }
        else if (dayOfTheWeek==5)
        {
            System.out.println("Its Friday");
        }
        else if (dayOfTheWeek==6)
        {
            System.out.println("Its Saturday");
        }
        else if (dayOfTheWeek==7)
        {
            System.out.println("Its Sunday");
        }
        else
        {
            System.out.println("Invalid day of the week");
        }
    }
}
