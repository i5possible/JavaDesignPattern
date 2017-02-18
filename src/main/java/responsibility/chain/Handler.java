package responsibility.chain;

abstract class Handler {
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);

    public void turnToNext(int requset) {
        if (this.successor != null) {
            successor.handleRequest(requset);
        }
    }
}
