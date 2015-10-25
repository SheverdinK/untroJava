package LessonThreCondition020915;



import java.util.Scanner;



public class TestInputScanner {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        int number;
        System.out.println("Please enter number");
        number = keyboardInput.nextInt();
        if (number >= 60)
            System.out.printf("OK");
        else
            System.out.printf("BAD");
        keyboardInput.close();

    }

}

