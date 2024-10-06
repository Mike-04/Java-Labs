package domain;

import java.util.Objects;

public abstract class Task {
    private String taskID;
    private String description;

    public Task(String taskID, String description) {
        this.taskID = taskID;
        this.description = description;
    }

    public String getTaskID() {
        return taskID;
    }

    public String getDescription() {
        return description;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  "taskID='" + taskID + '\'' +
                ", description='" + description + ',';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(taskID, task.taskID) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskID, description);
    }

    public abstract void execute();

}
