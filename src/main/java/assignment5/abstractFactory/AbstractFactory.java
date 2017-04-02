package assignment5.abstractFactory;

/**
 * Created by Admin on 2017/04/02.
 */
public class AbstractFactory {
    public SpeciesFactory getSpeciesFactory(String type){
        if ("Mammal".equals(type)){
            return new MammalFactory();
        }else
        {
            return new ReptileFactory();
        }
    }
}