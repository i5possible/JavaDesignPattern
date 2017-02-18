package responsibility.chain;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Handler concreteHandler1 = new ConcreteHandler1();
        Handler concreteHandler2 = new ConcreteHandler2();
        Handler concreteHandler3 = new ConcreteHandler3();
        concreteHandler1.setSuccessor(concreteHandler2);
        concreteHandler2.setSuccessor(concreteHandler3);

        Arrays.asList(8, 40, 20, 30, 10, 9, 7, 22, 33).forEach(concreteHandler1::handleRequest);

    }
}
