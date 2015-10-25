package LessonThreCondition020915;

import java.util.Random;

/**
 * Created by Rita on 02.09.2015.
 */

public class TestCondition {
    public static void main(String[] args) {
        int number;
        // number = (int)(Math.random()*100);
        Random r= new Random();
        number = r.nextInt(101);
        System.out.println(number);
        if (number%2 == 0)
        {
            System.out.printf("ODD");
                    }
        else
            System.out.println("EVEN");
    }
}
