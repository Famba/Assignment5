package assignment5.abstractFactory;

/**
 * Created by Admin on 2017/04/02.
 * Ingonyama is a xhosa word for lion
 */

public class Lion implements Animal {
    @Override
    public String makeSound() {
        return "King Leo Roar";
    }
}