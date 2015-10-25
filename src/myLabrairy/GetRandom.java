/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package myLabrairy;

import com.sun.corba.se.impl.oa.toa.TransientObjectManager;

import java.util.Random;

/**
 * Created by Kostya on 06.09.2015.
 */

public  class GetRandom {
Random numRandom = new Random ();
public  int getRandomNum(int startNum, int endNum){
    int num=startNum + numRandom.nextInt (endNum);
    return (num);
}
}
