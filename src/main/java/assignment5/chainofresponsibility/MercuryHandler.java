package assignment5.chainofresponsibility;

/**
 * Created by Admin on 2017/04/02.
 */
public class MercuryHandler extends PlanetHandler {

    @Override
    public String handleRequest(PlanetEnum request) {
        if (request == PlanetEnum.MERCURY) {
            return "mercury";
        } else {
            return successor.handleRequest(request);
        }
    }
}
