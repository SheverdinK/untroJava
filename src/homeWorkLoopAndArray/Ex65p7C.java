/* *
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package homeWorkLoopAndArray;

/**
 * Created by Kostya on 19.09.2015.
 */
public class Ex65p7C {


    private int oposNum = 0;
    private int count = 0;
    private int lastNum = 0;
    private int sum = 0;
    private boolean flag = true;

    public void getVal(int x) {

        while (isFlag()) {
            setLastNum(x % 10);
            setOposNum((int) (getOposNum() * 10 + getLastNum()));
            x = (int) x / 10;
            setCount(getCount() + 1);
            setSum(getSum() + getLastNum());
            if (x >= 1) setFlag(true);
            else
                setFlag(false);
        }
    }

    public int getOposNum() {
        return oposNum;
    }

    public void setOposNum(int oposNum) {
        this.oposNum = oposNum;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLastNum() {
        return lastNum;
    }

    public void setLastNum(int lastNum) {
        this.lastNum = lastNum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}




















