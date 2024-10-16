package domain.TaskRunner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrinterTaskRunner extends AbstractTaskRunner{
    public PrinterTaskRunner(TaskRunner taskRunner) {
        super(taskRunner);
    }

    private void printExecutionTime() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Task executed at: " + now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
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
