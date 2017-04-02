package assignment5;

import assignment5.proxy.FastThing;
import assignment5.proxy.Proxy1;
import junit.framework.Assert;
import org.junit.*;

/**
 * Created by Admin on 2017/04/02.
 */
public class ProxyTest {
    public ProxyTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test() {
        Proxy1 proxy = new Proxy1();
        FastThing fastThing = new FastThing();
        Assert.assertEquals(fastThing.sayHello(), "FastThing says wassup lad");
        Assert.assertEquals(proxy.sayHello(), "SlowThing says wassup lad");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUpMethod() throws Exception {
    }

    @After
    public void tearDownMethod() throws Exception {
    }
}

