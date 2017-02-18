package responsibility.chain;

class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("Handle2 handle : " + request);
        } else {
            turnToNext(request);
        }
    }
}
