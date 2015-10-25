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
 * Created by Kostya on 19.09.2015.
 */
public class Ex6_5p8 {
    public static void main(String[] args) {
        GetRandom maxNum = new GetRandom();
        int  x = maxNum.getRandomNum(10, 50);
        System.out.println("x = " + x);
        double  fabNum=0;
        double temp1=1;
        double temp2=1;
        for (int i=3; i<=x; i++) {
        fabNum = temp1+temp2;
            temp1=temp2;
            temp2=fabNum;
            System.out.println("fabNum = " + fabNum);
        }
        System.out.println(" Fab Number in possitoin  = " + fabNum);
    }
}
