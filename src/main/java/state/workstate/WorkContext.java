package state.workstate;

public class WorkContext {
    private Integer hour;
    private boolean workCompleted;
    private WorkState workState;

    public WorkContext(WorkState workState) {
        this.workState = workState;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public boolean isWorkCompleted() {
        return workCompleted;
    }

    public void setWorkCompleted(boolean workCompleted) {
        this.workCompleted = workCompleted;
    }

    public WorkState getWorkState() {
        return workState;
    }

    public void setWorkState(WorkState workState) {
        this.workState = workState;
    }

    public void writeProgram() {
        this.workState.writeProgram(this);
    }
}
