package state;

public class WorkStateMain {
    public static void main(String[] args) {
        WorkContext workContext = new WorkContext(new MorningWorkState());
        workContext.setWorkCompleted(false);
        workContext.setHour(9);
        workContext.writeProgram();
        workContext.setHour(11);
        workContext.writeProgram();
        workContext.setHour(13);
        workContext.writeProgram();
        workContext.setHour(15);
        workContext.writeProgram();
        workContext.setWorkCompleted(true);
        workContext.setHour(19);
        workContext.writeProgram();
        workContext.setHour(22);
        workContext.writeProgram();
    }
}
