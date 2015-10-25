
package myLabrairy;

import java.util.Scanner;


public class InValue {
    Scanner inChar = new Scanner(System.in);

    public  String getChar () {

        String character;
        character = inChar.next();
//       inChar.close();
        return character;

    }
    Scanner inLong = new Scanner(System.in);

    public long getLong () {

        long valLong;
        valLong = inLong.nextLong();
        return valLong;
    }

    Scanner inInt = new Scanner(System.in);

    public int getInt () {

        int valInt;
        valInt = inInt.nextInt ();
//        inInt.close ();
        return valInt;


    }
}
