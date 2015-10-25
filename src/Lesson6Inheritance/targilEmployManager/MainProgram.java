/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Lesson6Inheritance.targilEmployManager;

/**
 * Created by Kostya on 07.10.2015.
 */
public class MainProgram {
    public static void main (String[] args) {


    /*Employee employee = new Employee ();
    Manager manager  = new Manager ();*/

        /*employee.setName ("AAA");
        employee.setSalary (2500);
        System.out.println ("Call to getDetails for Employee");
        System.out.println (employee.getDetails ());

        System.out.println ("***************************");

        System.out.println ("Call to getDetails for Manager");

        manager.setSalary (3000);
        manager.setName ("BBB");
        manager.setDepartment ("OOO");*/

        Employee me = new Manager ("BBB");
        System.out.println (me.getDetails ());

    }
}

