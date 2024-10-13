package domain.Container;
import domain.Task;
import java.util.ArrayList;

public abstract class AbstractListContainer implements Container {
    protected ArrayList<Task> tasks;

    public AbstractListContainer() {
        this.tasks = new ArrayList<>();
    }

    @Override
    public void add(Task task) {
        addTask(task);
    }

    protected abstract void addTask(Task task);  // Implementată de subclase

    @Override
    public Task remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Container is empty");
        }
        return removeTask();
    }

    protected abstract Task removeTask();  // Implementată de subclase

    @Override
    public int size() {
        return tasks.size();
    }

    @Override
    public boolean isEmpty() {
        return tasks.isEmpty();
    }
}
