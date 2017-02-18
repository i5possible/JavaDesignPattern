package responsibility.chain;

class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request < 10) {
            System.out.println("Handle1 handle : " + request);
        } else {
            turnToNext(request);
        }
    }
}
