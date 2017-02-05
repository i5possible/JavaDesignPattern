package adapter;

public class Main {
    public static void main(String[] args) {
        Target target = new TargetA();
        target.doSomething();
        Target needAdapter = new Adapter(new Adaptee());
        needAdapter.doSomething();
    }
}
