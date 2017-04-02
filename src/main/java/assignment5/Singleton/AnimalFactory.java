package assignment5.Singleton;

/**
 * Created by Admin on 2017/04/02.
 */
public class AnimalFactory {
    private static AnimalFactory animalFactory = null;

    private AnimalFactory(){
    }
    public synchronized static AnimalFactory getInstance(){
        if(animalFactory == null){
            animalFactory = new AnimalFactory();
        }
        return animalFactory;
    }

    public Animal getAnimal(String type){
        if (type.equals("Canine")){
            return new Dog();
        }else
        {
            return new Cat();
        }
    }
}
