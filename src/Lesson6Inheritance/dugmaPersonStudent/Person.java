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
public class Person {
    private   String name;
    private int age;
    protected double id;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public double getId () {
        return id;
    }

    public void setId (double id) {
        this.id = id;
    }
    public  void printData() {
        System.out.println ("Name is " + name +"Age" + age + "ID" + id);
    }
}
