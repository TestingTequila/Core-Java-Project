package day10;

import java.util.Arrays;

public class ArrayRealTimeExample {
    public static void main(String[] args) {

        String[] tabs = {"HOME", "GIFT CERTIFICATES", "BRANDS", "BLOGS", "CONTACT US"};

        for(String t:tabs)
        {
            if(!(t.equals("BRANDS")))
            {
                System.out.println(t);
            }
        }

        System.out.println(Arrays.toString(tabs));

    }
}
