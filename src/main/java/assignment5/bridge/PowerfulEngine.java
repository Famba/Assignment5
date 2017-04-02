package assignment5.bridge;

/**
 * Created by Admin on 2017/04/02.
 */
public class PowerfulEngine implements Engine {

    int horsepower;

    public PowerfulEngine() {
        horsepower = 350;
    }

    @Override
    public int go() {
        return horsepower;
    }

    @Override
    public String toString() {
        return "the massive engine is running";
    }
}
