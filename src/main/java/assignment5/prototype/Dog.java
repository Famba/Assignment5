package assignment5.prototype;

/**
 * Created by Admin on 2017/04/02.
 */
public class Dog implements Prototype {

    private String sound;

    public Dog(String sound) {
        this.sound = sound;
    }

    @Override
    public Prototype doClone() {
        return new Dog(sound);
    }

    @Override
    public String toString() {
        return "This dog says " + sound;
    }
}