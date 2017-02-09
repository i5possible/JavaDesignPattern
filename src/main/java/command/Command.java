package command;

public class Command {
    private Receiver receiver;

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute(){
        receiver.action();
    }

    public void showReceiver() {
        System.out.println(receiver.getName());
    }
}
