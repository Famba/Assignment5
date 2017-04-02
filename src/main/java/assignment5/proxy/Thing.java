package assignment5.proxy;

/**
 * Created by Admin on 2017/04/02.
 */
public abstract class Thing {
    public String sayHello(){
        return this.getClass().getSimpleName() + " says wassup lad" ;
    }
}