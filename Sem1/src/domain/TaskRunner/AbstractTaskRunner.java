package domain.TaskRunner;

import domain.Task;

public abstract class AbstractTaskRunner implements TaskRunner {
    private TaskRunner taskRunner;
    AbstractTaskRunner(TaskRunner taskRunner){
        this.taskRunner = taskRunner;
    }

    @Override
    public void executeOneTask() {
        taskRunner.executeOneTask();
    }

    @Override
    public void executeAll() {
        taskRunner.executeAll();
    }

    @Override
    public void addTask(Task t) {
        taskRunner.addTask(t);
    }

    @Override
    public boolean hasTask() {
        return taskRunner.hasTask();
    }

}
