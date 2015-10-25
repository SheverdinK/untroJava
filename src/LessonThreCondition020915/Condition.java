package LessonThreCondition020915;

/**
 * Created by Rita on 02.09.2015.
 */
public class Condition {
    public static void main(String[] args) {
//        int grade=60;
//        if (grade>=60)
//        {
//            System.out.println("Congraulation");
//            if (grade==100)
//            {
//                System.out.println("Well Done");
//            }
//            else System.out.println("Sorry!");
        int i=0;
        int y=0;
        while ( y != 50){
            int x = (int) ((Math.random()) * 100);
            y=x;
            System.out.print("x = " + x);
            i++;
            if (x % 2 == 0)
                System.out.println(" is ODD");
            else
                System.out.println(" is Even");
        if (y==50)
            System.out.println("i = " + i);

        }

    }
}