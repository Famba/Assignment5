package assignment5;

import assignment5.chainofresponsibility.*;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Admin on 2017/04/02.
 */
public class ChainOfResponsibilityTest {
    public ChainOfResponsibilityTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test() {
        PlanetHandler mercuryHandler = new MercuryHandler();
        PlanetHandler venusHandler = new VenusHandler();
        PlanetHandler earthHandler = new EarthHandler();

        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);

        Assert.assertEquals(mercuryHandler.handleRequest(PlanetEnum.EARTH), "earth");
        Assert.assertEquals(mercuryHandler.handleRequest(PlanetEnum.MERCURY), "mercury");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
