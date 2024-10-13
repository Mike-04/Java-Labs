package domain.Container;

import domain.Task;

public class StackContainer extends AbstractListContainer {
    @Override
    protected void addTask(Task task) {
        tasks.add(task);  // Adaugă la sfârșitul listei (LIFO)
    }

    @Override
    protected Task removeTask() {
        return tasks.remove(tasks.size() - 1);  // Elimină ultimul element adăugat
    }
}
