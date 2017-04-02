package assignment5.bridge;

/**
 * Created by Admin on 2017/04/02.
 */
public class SmallEngine implements Engine {

    int horsepower;

    public SmallEngine() {
        horsepower = 100;
    }


    @Override
    public int go() {
        return horsepower;
    }
    @Override
    public String toString() {
        return "The small engine is running";
    }
}
