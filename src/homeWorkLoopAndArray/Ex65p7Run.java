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
public class Ex65p7Run {
    public static void main(String[] args) {
        Ex65p7C a = new Ex65p7C();
        GetRandom maxNum = new GetRandom();
        int randNum = maxNum.getRandomNum(0, 10000);
        System.out.println("x = " + randNum);
        a.getVal(randNum);
        System.out.println("-1- Number of digit = " + a.getCount());
        System.out.println("-2- First  digit = " + a.getLastNum());
        System.out.println("-3- Sum of digit = " + a.getSum());
        System.out.println("-4- Oposite number= " + a.getOposNum());
    }
}
