import java.lang.annotation.Target;
import domain.Task;
import domain.MessageTask;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import domain.SortingTask.*;


public class Main {
    public static Task[] createTasks(){
        Task[] tasks = new Task[5];
        tasks[0] = new MessageTask("1", "Description 1", "Message 1", "From 1", "To 1", LocalDateTime.now());
        tasks[1] = new MessageTask("2", "Description 2", "Message 2", "From 2", "To 2", LocalDateTime.now());
        tasks[2] = new MessageTask("3", "Description 3", "Message 3", "From 3", "To 3", LocalDateTime.now());
        tasks[3] = new MessageTask("4", "Description 4", "Message 4", "From 4", "To 4", LocalDateTime.now());
        tasks[4] = new MessageTask("5", "Description 5", "Message 5", "From 5", "To 5", LocalDateTime.now());
        return tasks;
    }
    //
    public static void printTasks(Task[] tasks){
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
    public static void main(String[] args) {
        Task[] tasks = createTasks();
        printTasks(tasks);
        testSortingTask();
    }
    //test the sorting task
    public static void testSortingTask(){
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        AbstractSorter sorter = new QuickSorter();
        SortingTask sortingTask = new SortingTask("1", "Sorting numbers", numbers, sorter);
        sortingTask.execute();
    }

}