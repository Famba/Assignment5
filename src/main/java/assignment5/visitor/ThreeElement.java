package assignment5.visitor;

/**
 * Created by Admin on 2017/04/02.
 */
public class ThreeElement implements NumberElement {
    int a;
    int b;
    int c;

    public ThreeElement(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void accept(NumberVisitor visitor) {
        visitor.visit(this);
    }
}