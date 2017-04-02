package assignment5.proxy;

/**
 * Created by Admin on 2017/04/02.
 */
public class Proxy1 {

    SlowThing slowThing;

    public Proxy1() {}

    public String sayHello() {
        if (slowThing == null) {
            slowThing = new SlowThing();
        }
        return slowThing.sayHello();
    }
}