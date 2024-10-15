package domain.TaskRunner;
import java.time.LocalDateTime;

public class PrinterTaskRunner extends AbstractTaskRunner{
    PrinterTaskRunner(TaskRunner taskRunner) {
        super(taskRunner);
    }

    private void printExecutionTime() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Task executed at: " + now);
    }

    @Override
    public void executeOneTask() {
        super.executeOneTask();
        printExecutionTime();
    }

    @Override
    public void executeAll() {
        while (hasTask()) {
            executeOneTask();
        }
    }


}
