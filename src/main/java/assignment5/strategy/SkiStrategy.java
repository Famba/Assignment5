package assignment5.strategy;

/**
 * Created by Admin on 2017/04/02.
 */
public class SkiStrategy implements Strategy {
    @Override
    public boolean checkTemperature(int temperatureInF) {
        return temperatureInF <= 32;
    }

}