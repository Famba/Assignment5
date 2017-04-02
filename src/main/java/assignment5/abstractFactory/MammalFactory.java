package assignment5.abstractFactory;

/**
 * Created by Admin on 2017/04/02.
 */
public class MammalFactory implements SpeciesFactory {
    @Override
    public Animal getAnimal(String type){
        if ("Dog".equals(type)){
            return new Dog();
        }else
        {
            return new Cat();
        }
    }
}