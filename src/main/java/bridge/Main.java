package bridge;

public class Main {
    public static void main(String[] args) {
        AbstractorImplA abstractorImplA = new AbstractorImplA();
        abstractorImplA.setImplementor(new ImplementorImplA());
        abstractorImplA.operation();

        abstractorImplA.setImplementor(new ImplementorImplB());
        abstractorImplA.operation();
    }
}
