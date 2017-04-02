package assignment5.chainofresponsibility;

/**
 * Created by Admin on 2017/04/02.
 */
public class VenusHandler extends PlanetHandler {
    @Override
    public String handleRequest(PlanetEnum request) {
        if (request == PlanetEnum.VENUS) {
            return "venus";
        } else {
            return successor.handleRequest(request);
        }
    }
}
