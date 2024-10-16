import domain.Task;
import domain.MessageTask;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;

import domain.SortingTask.*;
import domain.Container.*;
import domain.TaskRunner.*;

public class Main {
    public static Task[] createTasks(){
        /*
        Function that creates an array of tasks and returns it
        Input: -
        Output: tasks - array of tasks
         */
        Task[] tasks = new Task[5];
        tasks[0] = new MessageTask("1", "Description 1", "Message 1", "From 1", "To 1", LocalDateTime.now());
        tasks[1] = new MessageTask("2", "Description 2", "Message 2", "From 2", "To 2", LocalDateTime.now());
        tasks[2] = new MessageTask("3", "Description 3", "Message 3", "From 3", "To 3", LocalDateTime.now());
        tasks[3] = new MessageTask("4", "Description 4", "Message 4", "From 4", "To 4", LocalDateTime.now());
        tasks[4] = new MessageTask("5", "Description 5", "Message 5", "From 5", "To 5", LocalDateTime.now());
        return tasks;
    }
    public static void printTasks(Task[] tasks){
        /*
        Function that prints the tasks from an array
        Input: tasks - array of tasks
        Output: -
         */
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public static void testSortingTask(){
        /*
        Function that tests the SortingTask class
        Input: -
        Output: -
        */
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        AbstractSorter sorter = new QuickSorter();
        SortingTask sortingTask = new SortingTask("1", "Sorting numbers", numbers, sorter);
        sortingTask.execute();
    }
    public static void testStrategy(Strategy strategy){
        /*
        Function that tests the StrategyTaskRunner class
        Input: strategy - Strategy
        Output: -
         */
        Task[] tasks = createTasks();
        TaskRunner taskRunner = new StrategyTaskRunner(strategy);
        for (Task task : tasks) {
            taskRunner.addTask(task);
        }
        System.out.println("Executing tasks using " + strategy + " strategy:");
        taskRunner.executeAll();
    }

    public static void testStrategyPrinter(Strategy strategy){
        /*
        Function that tests the StrategyTaskRunner class and the PrinterTaskRunner class
        Input: strategy - Strategy
        Output: -
         */
        Task[] tasks = createTasks();
        TaskRunner taskRunner = new StrategyTaskRunner(strategy);
        for (Task task : tasks) {
            taskRunner.addTask(task);
        }
        System.out.println("Executing tasks using " + strategy + " strategy:");
        taskRunner.executeAll();

        TaskRunner taskRunner2 = new PrinterTaskRunner(taskRunner);
        for (Task task : tasks) {
            taskRunner.addTask(task);
        }
        System.out.println("Executing tasks using " + strategy + " strategy and printer:");
        taskRunner2.executeAll();
    }

    public static void testAll(Strategy strategy){
        /*
        Function that tests the StrategyTaskRunner class, the PrinterTaskRunner class and the DelayTaskRunner class
        Input: strategy - Strategy
        Output: -
         */
        Task[] tasks = createTasks();
        TaskRunner taskRunner = new StrategyTaskRunner(strategy);
        for (Task task : tasks) {
            taskRunner.addTask(task);
        }
        System.out.println("Executing tasks using " + strategy + " strategy:");
        taskRunner.executeAll();

        TaskRunner taskRunner2 = new PrinterTaskRunner(taskRunner);
        for (Task task : tasks) {
            taskRunner.addTask(task);
        }
        System.out.println("Executing tasks using " + strategy + " strategy and printer:");
        taskRunner2.executeAll();

        TaskRunner taskRunner3 = new DelayTaskRunner(taskRunner);
        for (Task task : tasks) {
            taskRunner.addTask(task);
        }
        System.out.println("Executing tasks using " + strategy + " strategy and printer and delay:");
        taskRunner3.executeAll();



    }


    public static void main(String[] args) {
        //print first arg
        Strategy strat = Strategy.valueOf(args[0]);
        Task[] tasks = createTasks();
        printTasks(tasks);
        testSortingTask();
        testStrategy(strat);
        testStrategyPrinter(strat);
        testAll(strat);

    }




}

