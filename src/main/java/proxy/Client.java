package proxy;

public class Client {
    public static void main(String[] args) {
        PursuitProxy fbbProxy = new PursuitProxy("LB","FBB");
        fbbProxy.giveDolls();
        fbbProxy.giveFlowers();
        fbbProxy.giveChocolate();
    }
}
