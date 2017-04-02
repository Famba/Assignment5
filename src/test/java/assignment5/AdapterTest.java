package assignment5;

import assignment5.adapter.TemperatureClassReporter;
import assignment5.adapter.TemperatureInfo;
import assignment5.adapter.TemperatureObjectReporter;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Admin on 2017/04/02.
 */
public class AdapterTest {

    public AdapterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test() {
         /*Class Adapter*/
        TemperatureInfo inf = new TemperatureClassReporter();
        inf.setTemperatureInF(32);
        Assert.assertEquals(inf.getTemperatureInC(), 0.0);
        Assert.assertEquals(inf.getTemperatureInF(), 32.0);
        inf.setTemperatureInC(0);
        Assert.assertEquals(inf.getTemperatureInC(), 0.0);
        Assert.assertEquals(inf.getTemperatureInF(), 32.0);

         /*Object Adapter*/
        TemperatureInfo tempInfo = new TemperatureObjectReporter();
        tempInfo.setTemperatureInF(85);
        tempInfo.setTemperatureInC(0);
        Assert.assertEquals(tempInfo.getTemperatureInC(), 0.0);
        Assert.assertEquals(tempInfo.getTemperatureInF(), 32.0);
        tempInfo.setTemperatureInF(85);
        Assert.assertEquals(tempInfo.getTemperatureInC(), 29.444444444444443);
        Assert.assertEquals(tempInfo.getTemperatureInF(), 85.0);



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

