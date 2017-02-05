package state;

public class RestWorkState extends WorkState {
    @Override
    void writeProgram(WorkContext workContext) {
        System.out.println("I'm home now!");
    }
}
