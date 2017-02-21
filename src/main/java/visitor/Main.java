package visitor;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.attach(new ConcreteElementA());
        container.attach(new ConcreteElementB());
        container.accept(new ConcreteVisitorX());
        container.accept(new ConcreteVisitorY());
    }
}
