package domain.Container;

import domain.Task;

public class QueueContainer extends AbstractListContainer {

    @Override
    protected void addTask(Task task) {
        tasks.add(task);  // Adaugă la sfârșitul listei (FIFO)
    }

    @Override
    protected Task removeTask() {
        return tasks.remove(0);// Elimină primul element adăugat
    }
}
