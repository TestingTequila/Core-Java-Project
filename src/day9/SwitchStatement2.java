package day9;

public class SwitchStatement2
{
    public static void main(String[] args) {
        String browserName = "IE";
        switch (browserName)
        {
            case "IE":
                System.out.println("Launch Internet Explorer Browser");
                break;
            case "Edge":
                System.out.println("Launch Edge Browser");
                break;
            case "Chrome":
                System.out.println("Launch Chrome Browser");
                break;
            case "Safari":
                System.out.println("Launch Safari Browser");
                break;
            default:
                System.out.println("Please enter a valid browser name");
                break;
        }
    }
}
