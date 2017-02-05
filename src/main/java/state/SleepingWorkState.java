package state;

public class SleepingWorkState extends WorkState {
    @Override
    void writeProgram(WorkContext workContext) {
        System.out.println("I'm too tired to go on. I'm going to sleep now!");
    }
}
