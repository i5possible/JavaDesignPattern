package state;

public class ConcreteStateB extends State {
    @Override
    public void Handle(MyContext myContext) {
        System.out.println("State B");
        myContext.setState(new ConcreteStateA());
    }
}
