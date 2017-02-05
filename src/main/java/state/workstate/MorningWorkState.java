package state.workstate;

public class MorningWorkState extends WorkState {
    @Override
    void writeProgram(WorkContext workContext) {
        if (workContext.getHour() < 12) {
            System.out.println("Now is morning, I'm working efficiently!");
        } else {
            workContext.setWorkState(new NoonWorkState());
            workContext.writeProgram();
        }
    }
}
