package adapter;

public class Adapter extends Target {
    private Adaptee adaptee;
    private String additionalInfo;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void doSomething() {
        adaptee.doSomething();
    }
}

