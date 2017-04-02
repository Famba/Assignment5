package assignment5.visitor;

import java.util.List;

/**
 * Created by Admin on 2017/04/02.
 */
public interface NumberVisitor {
    public int visit(TwoElement twoElement);
    public int visit(ThreeElement threeElement);
    public void visit(List<NumberElement> elementList);
}