package assignment5.visitor;

/**
 * Created by Admin on 2017/04/02.
 */
public interface NumberElement {
    public void accept(NumberVisitor visitor);
}