package domain.TaskRunner;

public class DelayTaskRunner extends AbstractTaskRunner {

    public DelayTaskRunner(TaskRunner taskRunner) {
        super(taskRunner);
    }

    @Override
    public void executeOneTask() {
        delayExecution();  // Introduce o întârziere de 3 secunde
        super.executeOneTask();  // Execută task-ul folosind funcționalitatea de bază
    }

    private void delayExecution() {
        try {
            Thread.sleep(3000);  // Întârzie cu 3 secunde
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void executeAll() {
        while (hasTask()) {
            executeOneTask();
        }
    }
}
