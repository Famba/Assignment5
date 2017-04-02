package assignment5.prototype;

/**
 * Created by Admin on 2017/04/02.
 */
public class Person implements Prototype {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public Prototype doClone() {
        return new Person(name);
    }

    @Override
    public String toString() {
        return "This person is named " + name;
    }
}