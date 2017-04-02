package assignment5;

import assignment5.strategy.Context;
import assignment5.strategy.HikeStrategy;
import assignment5.strategy.SkiStrategy;
import assignment5.strategy.Strategy;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Admin on 2017/04/02.
 */
public class StrategyTest {

    public StrategyTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        int temperatureInF = 60;

        /*SKIING*/
        Strategy skiStrategy = new SkiStrategy();
        Context context = new Context(temperatureInF, skiStrategy);
        Assert.assertFalse(context.getResult());

        /*HIKING*/
        Strategy hikeStrategy = new HikeStrategy();
        context.setStrategy(hikeStrategy);
        Assert.assertTrue(context.getResult());

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
