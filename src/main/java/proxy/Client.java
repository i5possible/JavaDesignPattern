package proxy;

public class Client {
    /**
     * Proxy is used in these situation:
     *  1. Remote proxy. You can hide your object in a different space.
     *  2. Virtual proxy. When a object need a long time to create it, you can use a proxy of it. So
     *      you can complete the work and hide the long time loading in the background.
     */

    public static void main(String[] args) {
        PursuitProxy fbbProxy = new PursuitProxy("LB","FBB");
        fbbProxy.giveDolls();
        fbbProxy.giveFlowers();
        fbbProxy.giveChocolate();
    }
}
