package domain.SortingTask;
import domain.Task;
import java.util.Arrays;

public class SortingTask extends Task {
    private int[] numbers;
    private AbstractSorter sorter;

    public SortingTask(String taskID, String description, int[] numbers, AbstractSorter sorter) {
        super(taskID, description);
        this.numbers = numbers;
        this.sorter = sorter;
    }

    @Override
    public void execute() {
        this.sorter.sort(numbers);
        System.out.println("Sorted numbers: "+ Arrays.toString(numbers));
    }
}
