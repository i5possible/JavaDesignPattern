package state;

public class ConcreteStateA extends State{
    @Override
    public void Handle(MyContext myContext) {
        System.out.println("State A");
        myContext.setState(new ConcreteStateB());
    }
}
