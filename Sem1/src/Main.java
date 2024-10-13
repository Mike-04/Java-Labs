import domain.Task;
import domain.MessageTask;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;

import domain.SortingTask.*;
import domain.Container.*;
import domain.TaskRunner.*;

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
    public static void testContainers() {
        // Test StackContainer (LIFO)
        Container stack = new StackContainer();
        stack.add(new MessageTask("1", "Stack Task 1", "Hello", "Alice", "Bob", LocalDateTime.now()));
        stack.add(new MessageTask("2", "Stack Task 2", "World", "Carol", "Dave", LocalDateTime.now()));
        System.out.println("StackContainer:");
        while (!stack.isEmpty()) {
            System.out.println(stack.remove());
        }

        // Test QueueContainer (FIFO)
        Container queue = new QueueContainer();
        queue.add(new MessageTask("1", "Queue Task 1", "First", "Eve", "Frank", LocalDateTime.now()));
        queue.add(new MessageTask("2", "Queue Task 2", "Second", "George", "Hank", LocalDateTime.now()));
        System.out.println("QueueContainer:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
    //test the sorting task
    public static void testSortingTask(){
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        AbstractSorter sorter = new QuickSorter();
        SortingTask sortingTask = new SortingTask("1", "Sorting numbers", numbers, sorter);
        sortingTask.execute();
    }
    public static void testTaskRunner(){
        Task[] tasks = createTasks();
        TaskRunner taskRunner = new StrategyTaskRunner(Strategy.LIFO);
        for (Task task : tasks) {
            taskRunner.addTask(task);
        }
        System.out.println("Executing tasks using LIFO strategy:");
        while (taskRunner.hasTask()) {
            taskRunner.executeOneTask();
        }
        taskRunner = new StrategyTaskRunner(Strategy.FIFO);
        for (Task task : tasks) {
            taskRunner.addTask(task);
        }
        System.out.println("Executing tasks using FIFO strategy:");
        while (taskRunner.hasTask()) {
            taskRunner.executeOneTask();
        }
    }
    public static void main(String[] args) {
        Task[] tasks = createTasks();
        printTasks(tasks);
        testSortingTask();
        testContainers();
        testTaskRunner();

    }




}

