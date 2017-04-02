package assignment5;

import assignment5.Singleton.Animal;
import assignment5.Singleton.AnimalFactory;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Admin on 2017/04/02.
 */
public class SingletonTest {

    public SingletonTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test() {
        AnimalFactory animals = AnimalFactory.getInstance();
        Animal dog = animals.getAnimal("Canine");
        Animal cat = animals.getAnimal("Cat");
        Assert.assertEquals(dog.makeSound(), "Woof");
        Assert.assertEquals(cat.makeSound(), "Meow");
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
