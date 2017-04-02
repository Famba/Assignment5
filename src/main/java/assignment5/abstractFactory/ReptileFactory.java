package assignment5.abstractFactory;

/**
 * Created by Admin on 2017/04/02.
 */
public class ReptileFactory implements SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (type.equals("Snake")){
            return new Snake();
        }else
        {
            return new Lion();
        }
    }
}