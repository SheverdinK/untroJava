/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package LessonFor060915;

import myLabrairy.GetRandom;

import java.util.Scanner;

/**
 * Created by Kostya on 06.09.2015.
 */
public class LoopEx {
public static void main (String[] args) {
    GetRandom a = new GetRandom ();
    int startN = 0;
    int endN = 100000;

int flag=0;
    int b = a.getRandomNum (startN, endN);
    int newNum=12321;
    System.out.println ("newNum = " + newNum);
    int temp = 1;
    int dif=0;
    for (int i=5; i>=1  ; i=i-2){
        System.out.println ("i = " + i);
//        Scanner inChar = new Scanner(System.in);
//        String character;
//        System.out.println ("Enter String");
//        character = inChar.next();
        int aaa= (int) (newNum/ (Math.pow (10,i)));
        System.out.println ("aaa = " + aaa);
        if (aaa >=1) {
        temp = (int) ((int) newNum /(Math.pow (10,i)));
        dif = newNum % 10;
            double ii=i-1;
        newNum = (int) (((int)(newNum/10))%(Math.pow(10,ii)));
        System.out.println ("newNum = " + newNum);
        if (temp == dif)
            flag=1;
        else flag=0;
            System.out.println ("temp = " + temp + "dif = " +dif);
            System.out.println ("flag = " + flag);
        }
        System.out.println ("Number is POLINDROM");
    }
   }

}
