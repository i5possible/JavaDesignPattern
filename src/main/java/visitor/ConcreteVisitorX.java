package visitor;

public class ConcreteVisitorX extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(this.getClass().getName() + " visit " + concreteElementA.getClass().getName());
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(this.getClass().getName() + " visit " + concreteElementB.getClass().getName());
    }
}
