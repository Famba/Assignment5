package assignment5;

import assignment5.abstractFactory.AbstractFactory;
import assignment5.abstractFactory.Animal;
import assignment5.abstractFactory.SpeciesFactory;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Admin on 2017/04/02.
 */
public class AbstractFactoryTest {

    public AbstractFactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test() {
        AbstractFactory abstractFactory = new AbstractFactory();
         /*Get species from abstract factory*/
        SpeciesFactory mammals = abstractFactory.getSpeciesFactory("Mammal");
        SpeciesFactory reptiles = abstractFactory.getSpeciesFactory("Reptile");

         /*Get animals from species factory ie mammal and reptiles*/
        Animal dog = mammals.getAnimal("Dog");
        Assert.assertEquals(dog.makeSound(), "Woof");

        Animal cat = mammals.getAnimal("Cat");
        Assert.assertEquals(cat.makeSound(), "Meow");

        Animal snake = reptiles.getAnimal("Snake");
        Assert.assertEquals(snake.makeSound(), "Hiss");
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