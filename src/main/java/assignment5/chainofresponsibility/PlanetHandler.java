package assignment5.chainofresponsibility;

/**
 * Created by Admin on 2017/04/02.
 */
public abstract class PlanetHandler {
    PlanetHandler successor;

    public void setSuccessor(PlanetHandler successor) {
        this.successor = successor;
    }

    public abstract String handleRequest(PlanetEnum request);
}
