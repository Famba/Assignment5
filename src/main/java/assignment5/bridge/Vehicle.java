package assignment5.bridge;

/**
 * Created by Admin on 2017/04/02.
 */
public abstract class Vehicle {
    Engine engine;
    int weightInKilos;

    public abstract String drive();

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String reportOnSpeed(int horsepower){
        int ratio = weightInKilos / horsepower;
        if (ratio < 3) {
            return "The vehicle is going at a fast speed.";
        }else if((ratio >= 3)&&(ratio < 8)){
            return "The vehicle is going at a average speed.";
        }
        else {
            return "The vehicle is going at a slow speed.";
        }
    }
}
