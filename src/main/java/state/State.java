package state;

public abstract class State {
    public abstract void Handle(MyContext myContext);
}