package assignment5.chainofresponsibility;

/**
 * Created by Admin on 2017/04/02.
 */
public class EarthHandler extends PlanetHandler {
    @Override
    public String handleRequest(PlanetEnum request) {
        if (request == PlanetEnum.EARTH) {
            return "earth";
        } else {
            return successor.handleRequest(request);
        }
    }
}
