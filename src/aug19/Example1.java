package aug19;


/**
 * Created by Konst-laptop on 19.08.2015.
 */
class Example1 {

    public  static void main (String [] args) {
         int y = 60;
        Dog dog = new Dog(y);
        dog.setWeight(y);
        int x = dog.getWeight();
        System.out.println(x);
    }
}

