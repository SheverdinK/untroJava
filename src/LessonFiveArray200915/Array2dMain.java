/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package LessonFiveArray200915;

import myLabrairy.InValue;

/**
 * Created by Kostya on 20.09.2015.
 */
public class Array2dMain {
    public static void main(String[] args) {
        int[][] grades;
        int numStudents, numExams;
        InValue input = new InValue();

        System.out.println("Enter number of student");

        numStudents = input.getInt();
        System.out.println("Enter number of exams");
        numExams = input.getInt();

        grades = new int[numStudents][numExams];
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = (int) (Math.random() * 100);

                System.out.println(grades[i][j] + " ");
                System.out.println();
            }
        }
        int classAverage = 0;
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                classAverage += grades[i][j];
            }
        }
    }
}
