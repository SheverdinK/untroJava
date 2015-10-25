

package LessonFor060915;
public class AddLoop {
public static void main (String[] args) {
 for (int i = 1; i <=10 ; i++) {

        for (int j = 1; j <=i ; j++) {
            int ij=i*j;
    System.out.printf ("%2d", ij);
            System.out.print (" ");
        }
        System.out.println (" ");
    }
}
}
