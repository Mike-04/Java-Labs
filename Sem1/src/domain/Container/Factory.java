package domain.Container;

public interface Factory {
    Container createContainer(Strategy strategy);
}