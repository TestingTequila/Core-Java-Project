package day9;

public class SwitchExample
{
    public static void main(String[] args) {
        int dayOfTheWeek =10;
        switch (dayOfTheWeek)
        {
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            default:
                System.out.println("Invalid day of the week...");
                break;
            case 7:
                System.out.println("Its Sunday");
                break;
        }
    }

}

//Switch will not work for long, float, double and boolean data types
