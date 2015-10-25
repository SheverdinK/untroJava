/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package targilGadol2510;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Student {
   private String name;
   private int id;

    Map  <Exams, Integer>  examMistakeMap = new HashMap<Exams, Integer> ()
     SimpleDateFormat
    public Student (String name, int id) {
        this.id = id;
        setName (name); ;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void addTest(){
    }

    @Override
    public String toString () {
        return "Student{" +
                "name='" + getName () + '\'' +
                ", id=" + getId () + '}';
    }

    public void addExam (String nameExam, String nemeLector, Date date){

    }
}

