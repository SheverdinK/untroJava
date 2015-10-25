package myHomeWork1;

 import myHomeWork1.PrinterEx3;
/**
 * Created by Konst-laptop on 22.08.2015.
 */
public class MainEx3 {
    public static void main(String[] args) {

        PrinterEx3 fields = new PrinterEx3();

        fields.setVisitors();
        fields.setPart2();
        fields.setVisPlus(-3);
        int sumVis=fields.getVisPlus()+fields.getVisitors();

        System.out.println (fields.getPart1() + " " + sumVis + " " + fields.getPart2());
    }
}
