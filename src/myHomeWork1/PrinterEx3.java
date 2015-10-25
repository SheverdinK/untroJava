package myHomeWork1;

/**
 * Created by Konst-laptop on 22.08.2015.
 */
public class PrinterEx3 {
    private String part1, part2 ;
    private int visitors, visPlus;

    public void setPart1() {
        part1="There will be ";
    }

    public void setVisitors() {
        visitors=5;
    }

    public void setPart2() {
        part2="people for dinner";
    }

    public String getPart1() {
        return part1;
    }

    public int getVisitors() {
        return visitors;
    }

    public String getPart2() {
        return part2;
    }

    public void setVisPlus(int a) {
        if (a > 0) {
            visPlus = a;
        }
    }

    public int getVisPlus() {
        return visPlus;
    }
}
