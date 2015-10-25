/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package LessonFiveArray200915;

/**
 * Created by Kostya on 20.09.2015.
 */
public class ExOopMain {
    public static void main(String[] args) {
         Rect r1 = new Rect();
//        r1.width=20;
         r1.setWidth(10);
        r1.getWidth();
//        r1.heigth=20;
        r1.setHeigth(20);
        r1.getHeigth();
        r1.show();

        Rect r2 = new Rect();
//        r2.width=15;
        r2.setWidth(-10);
        r2.getWidth();
//        r2.heigth=12;
       r2.setHeigth(5);
        r2.getHeigth();
        r2.show();
        System.out.println("Width " + r1.getWidth());
    }
}
