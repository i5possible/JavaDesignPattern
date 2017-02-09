package command;

public class Receiver {
    private String name;

    public Receiver(String name) {
        this.name = name;
    }

    public void action() {
        System.out.println(name + "  action!");
    }

    public String getName() {
        return name;
    }
}
