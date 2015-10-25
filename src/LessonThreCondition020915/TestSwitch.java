package LessonThreCondition020915;

import java.util.Scanner;

/**
 * Created by Rita on 02.09.2015.
 */
public class TestSwitch {
    public static void main(String[] args) {
        int userSelection;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number");
        userSelection=input.nextInt();
        switch (userSelection)
        {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
        }


    }
}
