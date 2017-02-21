package visitor;

public class ConcreteElementB extends Element {
    @Override
    void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    @Override
    void otherOperate() {

    }
}
