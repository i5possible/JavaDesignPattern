package state;

public class MyContext {
    private State state;

    public MyContext(State state) {
        this.state = state;
    }

    public void request() {
        state.Handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
