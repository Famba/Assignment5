package assignment5.visitor;

/**
 * Created by Admin on 2017/04/02.
 */
public class TwoElement implements NumberElement {
    int a;
    int b;

    public TwoElement(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void accept(NumberVisitor visitor) {
        visitor.visit(this);
    }
}