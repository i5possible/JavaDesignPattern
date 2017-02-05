package state.workstate;

public class NoonWorkState extends WorkState {
    @Override
    void writeProgram(WorkContext workContext) {
        if (workContext.getHour() < 14) {
            System.out.println("Now is noon, I'm eating launch!");
        } else {
            workContext.setWorkState(new AfternoonWorkState());
            workContext.writeProgram();
        }
    }
}
