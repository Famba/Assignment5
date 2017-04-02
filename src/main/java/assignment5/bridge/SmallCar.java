package assignment5.bridge;

/**
 * Created by Admin on 2017/04/02.
 */
public class SmallCar extends Vehicle {

    public SmallCar(Engine engine) {
        this.weightInKilos = 600;
        this.engine = engine;
    }

    @Override
    public String drive() {
        int horsepower = engine.go();
        return"The small car is driving " + engine + " " + reportOnSpeed(horsepower);
    }
}
