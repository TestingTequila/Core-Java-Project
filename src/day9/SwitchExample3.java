package day9;

public class SwitchExample3
{
    public static void main(String[] args) {
        int dayOfTheWeek =3;
        switch (dayOfTheWeek)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("We will go to the office");
                break;
            case 6:
            case 7:
                System.out.println("Its weekend...Lets Party");
                break;
            default:
                System.out.println("Invalid day of the week...");
                break;
        }
    }

}

//Switch will not work for long, float, double and boolean data types
