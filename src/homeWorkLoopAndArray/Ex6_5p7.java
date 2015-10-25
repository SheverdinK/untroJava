/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package homeWorkLoopAndArray;

import myLabrairy.GetRandom;

/**
 * Created by Kostya on 18.09.2015.
 */
public class Ex6_5p7 {
    public static void main(String[] args) {
       GetRandom maxNum = new GetRandom();
        int  x = maxNum.getRandomNum(0, 100000);
        System.out.println("x = " + x);
        int lastNum=0;
        int oposNum=0;
        int count=0;
        boolean flag=true;
        int sum = 0;
        while ( flag ) {
            lastNum = x %10;
            oposNum =(int)( oposNum*10 + lastNum);
            x = (int) x/10;
            count++;
            if (x>=1){ flag=true; }
            else flag=false;
            sum=sum+lastNum;
        }
        System.out.println("-1- count = " + count);
        System.out.println("-2- First Last digit = " + lastNum);
        System.out.println("-3- Sum of digit = " + sum);
        System.out.println("-4- Oposite number= " + oposNum);
    }
}
