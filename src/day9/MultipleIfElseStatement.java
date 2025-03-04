package day9;

public class MultipleIfElseStatement
{
    public static void main(String[] args) {
        int dayOfTheWeek=7;
        if(dayOfTheWeek==1)
        {
            System.out.println("Its Monday");
        }
        if (dayOfTheWeek==2)
        {
            System.out.println("Its Tuesday");
        }
        if (dayOfTheWeek==3)
        {
            System.out.println("Its Wednesday");
        }
        if (dayOfTheWeek==4)
        {
            System.out.println("Its Thursday");
        }
        if (dayOfTheWeek==5)
        {
            System.out.println("Its Friday");
        }
        if (dayOfTheWeek==6)
        {
            System.out.println("Its Saturday");
        }
        if (dayOfTheWeek==27)
        {
            System.out.println("Its Sunday");
        }
        else
        {
            System.out.println("Invalid day of the week");
        }
    }
}
//Performance would be slow