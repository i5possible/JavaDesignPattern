package state;

public class Main {
    public static void main(String[] args) {
        MyContext myContext = new MyContext(new ConcreteStateA());

        myContext.request();
        myContext.request();
        myContext.request();
        myContext.request();
        myContext.request();
        myContext.request();
    }
}
