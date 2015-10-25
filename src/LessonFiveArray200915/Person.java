/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package LessonFiveArray200915;

import homeWorkLoopAndArray.Ex65p7C;

/**
 * Created by Kostya on 20.09.2015.
 */
public class Person {
    Ex65p7C a = new Ex65p7C();

    /**
     * ********Constructor***************
     */
//     public, name like the name of the class and NO return VALUE!!!!!!!!!!
    public Person(String name, int age, int id) {
        System.out.println("COnstructor With PARAM");
        setId(id);
        setName(name);
        setAge(age);
    }

    // if write constructor with parametr,
    // NEED  to WRITE constr CONSTR without PARAM
    public Person(String name) {
         /** this(name, 18, 111111)   invoke the other  constructor  with parametrs */
        System.out.println("Constructor WithOUT PARAM");
    }
    public  Person (){
        this ("anonymus", 0, 0 );
    }

    private int age, id;
    private String name;

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else System.out.println("NUmber is MUST > 0");
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        a.getVal(id);
        if (a.getCount() == 9)
            this.id = id;
        else System.out.println("NUmber of digit IS MUST 9");
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("Name is  " + getName() + " Age = " + getAge() + " and ID is: " + getId());
    }

}
