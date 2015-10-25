/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package myLabrairy;


public class ToBeContinue  extends InValue {

InValue a = new InValue ();

public boolean yOrN () {
    int flag = 1;
    String symbol;
    String srtY = "Y";
    String srty = "y";
    String strN = "N";
    String strn = "n";
    boolean boolVal = true;
    while (flag == 1) {
        System.out.println ("Press 'Y' to continue or 'N' to exit");
        symbol = a.getChar ();
        if (symbol.equals (srty) || symbol.equals (srtY)) {
            boolVal = true;
            flag = 0;
        }
        else if (symbol.equals (strn) || symbol.equals (strN)) {
                boolVal = false;
            flag = 0;
            }
            else {
                System.out.println ("The symbol is not correct");
                System.out.println ("Enter  'Y' to continue  or 'N' to exit only");
//                flag = 1;
            }
        }

    if (boolVal) return true;
    else {
        return false;
    }
}
}

