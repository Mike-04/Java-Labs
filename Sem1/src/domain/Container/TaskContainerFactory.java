package domain.Container;

public class TaskContainerFactory implements Factory {
    //singleton design pattern
    private static TaskContainerFactory instance;

    private TaskContainerFactory() {}

    // Metoda statică pentru a obține instanța unică
    public static TaskContainerFactory getInstance() {
        if (instance == null) {
            instance = new TaskContainerFactory();
        }
        return instance;
    }

    @Override
    public Container createContainer(Strategy strategy) {
        return switch (strategy) {
            case LIFO -> new StackContainer();
            case FIFO -> new QueueContainer();
            default -> throw new IllegalArgumentException("Invalid strategy");
        };
    }
}
