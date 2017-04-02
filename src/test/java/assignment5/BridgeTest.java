package assignment5;

import assignment5.bridge.*;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Admin on 2017/04/02.
 */
public class BridgeTest {

    public BridgeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test() {
        Vehicle vehicle = new Bus(new SmallEngine());
        Assert.assertEquals(vehicle.drive(), "The Bus is driving "
                + "The small engine is running "
                + "The vehicle is going at a slow speed.");

        /*Change the engine to small - slow speed*/
        vehicle.setEngine(new PowerfulEngine());
        Assert.assertEquals(vehicle.drive(), "The Bus is driving "
                + "the massive engine is running "
                + "The vehicle is going at a slow speed.");


        vehicle = new SmallCar(new SmallEngine());
        Assert.assertEquals(vehicle.drive(), "The small car is driving "
                + "The small engine is running "
                + "The vehicle is going at a average speed.");

        /*Change the engine to big - fast speed*/
        vehicle.setEngine(new PowerfulEngine());
        Assert.assertEquals(vehicle.drive(), "The small car is driving "
                + "the massive engine is running "
                + "The vehicle is going at a fast speed.");


        vehicle = new SmallCar(new PowerfulEngine());
        Assert.assertEquals(vehicle.drive(), "The small car is driving "
                + "the massive engine is running "
                + "The vehicle is going at a fast speed.");
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
