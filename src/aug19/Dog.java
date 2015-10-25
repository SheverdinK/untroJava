package aug19;

/**
 * Created by Konst-laptop on 19.08.2015.
 */
public class Dog {
    private int weight;

// Constractor

    public Dog(int w) {
        setWeight(w);
    }
// S E T

    public void setWeight(int w) {
        if (w <= 50){
            weight = w;
        }
            else {
            System.out.println("Weight is over the  max Weight");
        }
    }
    // G E T
    public int getWeight() {
        return weight;
    }
}
