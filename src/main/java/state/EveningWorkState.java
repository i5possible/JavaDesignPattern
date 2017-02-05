package state;

public class EveningWorkState extends WorkState {
    @Override
    void writeProgram(WorkContext workContext) {
        if (workContext.isWorkCompleted()) {
            workContext.setWorkState(new RestWorkState());
            workContext.writeProgram();
        } else {
            if (workContext.getHour() > 21) {
                workContext.setWorkState(new SleepingWorkState());
                workContext.writeProgram();
            } else {
                System.out.println("It's late, but I am still working!");
            }
        }
    }
}
