
public class TodoTask {
    private String taskName;
    private boolean isCompleted;

    public TodoTask(String taskName) {
        this.taskName = taskName;
        this.isCompleted = false;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[X] " : "[ ] ") + taskName;
    }
}