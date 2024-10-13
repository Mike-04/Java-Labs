package domain.TaskRunner;

import domain.Container.*;
import domain.*;

public class StrategyTaskRunner implements TaskRunner {
    private Container container;

    public StrategyTaskRunner(Strategy strategy) {
        this.container = TaskContainerFactory.getInstance().createContainer(strategy);
    }

    @Override
    public void executeOneTask() {
        if (container.isEmpty()) {
            return;
        }
        Task task = container.remove();
        task.execute();
    }

    @Override
    public void executeAll() {
        while (!container.isEmpty()) {
            Task task = container.remove();
            task.execute();
        }
    }

    @Override
    public void addTask(Task t) {
        container.add(t);
    }

    @Override
    public boolean hasTask() {
        return !container.isEmpty();
    }
}
