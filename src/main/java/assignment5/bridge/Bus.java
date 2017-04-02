package assignment5.bridge;

/**
 * Created by Admin on 2017/04/02.
 */
public class Bus extends Vehicle {
    public Bus(Engine engine) {
        this.weightInKilos = 3000;
        this.engine = engine;
    }

    @Override
    public String drive() {
        int horsepower = engine.go();
        return "The Bus is driving " + engine + " " + reportOnSpeed(horsepower);
    }
}
