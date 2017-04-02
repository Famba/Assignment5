package assignment5.proxy;

/**
 * Created by Admin on 2017/04/02.
 */
public class SlowThing extends Thing {
    public SlowThing() {
        try {
            /*Slow down creation by 5s*/
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}