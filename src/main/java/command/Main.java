package command;

public class Main {
    public static void main(String[] args) {
        Command c1 = new Command();
        c1.setReceiver(new Receiver("r1"));
        Command c2 = new Command();
        c2.setReceiver(new Receiver("r2"));
        Command c3 = new Command();
        c3.setReceiver(new Receiver("r3"));


        Invoker girl = new Invoker();
        girl.addCommand(c1);
        girl.addCommand(c2);
        girl.addCommand(c3);
        girl.displayCommands();
        girl.deleteCommands(c2);
        girl.displayCommands();

        girl.notifyReceiver();
        girl.displayCommands();
    }
}
