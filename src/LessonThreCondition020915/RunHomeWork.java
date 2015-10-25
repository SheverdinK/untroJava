

package LessonThreCondition020915;

import myLabrairy.ToBeContinue;

/**
 * Created by Kostya on 05.09.2015.
 */
public class RunHomeWork {
public static void main (String[] args) {

    ToBeContinue geter = new ToBeContinue ();
    HomeWorkOne runer = new HomeWorkOne ();
    boolean b = true;
    while (b) {
        b = false;

        int flag=0;
        while (flag==0){
            System.out.println ("Enter Number  of EX (1 or 2)");
            flag=1;
            int numEx = geter.getInt ();
            switch (numEx) {
                case 1:
                   runer.exGrade ();
                    break;
                case 2:
                    runer.exMonth ();
                    break;
                default:{
                    System.out.println ("Number is 'NOT CORRECT'");
//                    numEx = geter.getInt ();
                    flag=0;
                    break;
                }
            }
        }
        b = geter.yOrN ();
    }
}

}
