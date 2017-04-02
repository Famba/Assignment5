package assignment5.visitor;

import java.util.List;

/**
 * Created by Admin on 2017/04/02.
 */
public class SumVisitor implements NumberVisitor {

    @Override
    public int visit(TwoElement twoElement) {
        return twoElement.a + twoElement.b;
    }

    @Override
    public int visit(ThreeElement threeElement) {
        return threeElement.a + threeElement.b + threeElement.c;
    }

    @Override
    public void visit(List<NumberElement> elementList) {
        for (NumberElement numberElement : elementList) {
            numberElement.accept(this);
        }
    }
}
