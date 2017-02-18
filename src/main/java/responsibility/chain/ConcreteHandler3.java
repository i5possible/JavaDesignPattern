package responsibility.chain;

class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("Handle3 handle : " + request);
        } else {
            turnToNext(request);
        }
    }
}
