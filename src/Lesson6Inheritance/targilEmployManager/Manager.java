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
public class Manager extends Employee {
    public String getDepartment () {
        return department;
    }

    public Manager (String department) {
        super();
       setDepartment (department);
    }

    public void setDepartment (String department) {
        this.department = department;
    }

    private String department;

    @Override
    public String getDetails () {
        return super.getDetails ()+ "Department:  " + department;
    }
}
