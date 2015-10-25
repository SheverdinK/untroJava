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
public class Rect {
  private  int   width, heigth;
/** accessor function
    Getter / Setter*/
//     Without This
/*public void setHeigth(int h) {
    if (h > 0) heigth = h;
    else System.out.println("Number can must > 0");
}*/
            //with THIS


public void setHeigth(int heigth) {
    if (heigth > 0) this.heigth = heigth;
    else System.out.println("Number can must > 0");
}

    public int getHeigth() {
        return heigth;
    }

    public void setWidth(int w) {
        if (w > 0) width = w;
        else System.out.println("Number can must > 0");
    }
    public int getWidth() {
        return width;
    }

    public  void show() {
        System.out.println("width = " + width);
        System.out.println("heigth = " + heigth);
    }
}
