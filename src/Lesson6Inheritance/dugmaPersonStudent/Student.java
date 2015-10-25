/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Lesson6Inheritance.dugmaPersonStudent;

/**
 * Created by Kostya on 07.10.2015.
 */
public class Student extends Person {
    private int grade;

    public int getGrade () {
        return grade;
    }

    public void setGrade (int grade) {
        this.grade = grade;
    }

    @Override
    public void printData () {
        /** if chenge in class Person we need to change they too*/
//        System.out.println ("Name is " + getName() +"Age" + getAge() + "ID" + getId());
        super.printData ();
        System.out.println ("Grade =" + getGrade ());

        /**id    =655379;     id is protected
        age = 342;           age   */

    }
}
