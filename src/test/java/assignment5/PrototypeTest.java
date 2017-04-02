package assignment5;

import assignment5.prototype.Dog;
import assignment5.prototype.Person;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Admin on 2017/04/02.
 */
public class PrototypeTest {
    public PrototypeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test() {
        Person bryan = new Person("Famba");
        Dog dog = new Dog("Wooof");

        Person bryanClone = (Person) bryan.doClone();
        Dog dogClone = (Dog)dog.doClone();

        Assert.assertEquals(bryan.toString(), bryanClone.toString());
        Assert.assertEquals(dog.toString(), dogClone.toString());

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
