package assignment5.abstractFactory;

/**
 * Created by Admin on 2017/04/02.
 */
public class Dog implements Animal {
    @Override
    public String makeSound() {
        return ("Woof");
    }
}
