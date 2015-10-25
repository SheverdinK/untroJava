/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package targilGadol2510;

import java.util.Date;

public class Exams {
    private  String nameExam;
    private  String nameLector;
    Date date;

    public Exams (String nameExam, String nameLector, Date date) {
        this.nameExam = nameExam;
        this.nameLector = nameLector;
        this.date = date;
    }

    public String getNameExam () {
        return nameExam;
    }

    public void setNameExam (String nameExam) {
        this.nameExam = nameExam;
    }

    public String getNameLector () {
        return nameLector;
    }

    public void setNameLector (String nameLector) {
        this.nameLector = nameLector;
    }

    public Date getDate () {
        return date;
    }

    public void setDate (Date date) {
        this.date = date;
    }

    @Override
    public String toString () {
        return "Exams{" +
                "nameExam='" + nameExam + '\'' +
                ", nameLector='" + nameLector + '\'' +
                ", date=" + date + '}';
    }
}
