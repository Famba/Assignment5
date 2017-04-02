package assignment5.adapter;

/**
 * Created by Admin on 2017/04/02.
 */
public class CelciusReporter {
    double temperatureInC;

    public CelciusReporter() {
    }

    public double getTemperature() {
        return temperatureInC;
    }

    public void setTemperature(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }
}