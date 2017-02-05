package state.workstate;

public class AfternoonWorkState extends WorkState {
    @Override
    void writeProgram(WorkContext workContext) {
        if (workContext.getHour() < 18) {
            System.out.println("Now is afternoon, I'm sleepy");
        } else {
            workContext.setWorkState(new EveningWorkState());
            workContext.writeProgram();
        }
    }
}
