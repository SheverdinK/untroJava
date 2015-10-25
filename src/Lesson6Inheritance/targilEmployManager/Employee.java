/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Lesson6Inheritance.targilEmployManager;

import java.util.Date;

/**
 * Created by Kostya on 07.10.2015.
 */
public class Employee {

    private String name;
    private double salary;
    private Date birthday ;

    public Employee (String name, double salary) {
        setSalary (salary);
        setName (name);
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Date getBirthday () {
        return birthday;
    }

    public void setBirthday (Date birthday) {
        this.birthday = birthday;
    }

    public double getSalary () {
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }
    public String getDetails() {
        return "Name is  " + name + " and Sallary =  " + salary;
    }
}
