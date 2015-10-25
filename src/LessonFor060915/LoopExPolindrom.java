package LessonFor060915;

import myLabrairy.InValue;

public class LoopExPolindrom {
public static void main (String[] args) {

    InValue num = new InValue ();
    System.out.println ("Enter Number of X '*'");
    int x = num.getInt ();
    System.out.println ("Enter Number of Y '*'");
    int y = num.getInt ();

    int i = 1;
    for (i = 1; i <= y; i++) {
        System.out.println (" ");
        for (int j=1; j<=x; j++ )
            System.out.printf ("* ");
    }
}
}