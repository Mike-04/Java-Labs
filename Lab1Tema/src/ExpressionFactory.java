import complexExpression.*;

public class ExpressionFactory {
    private static ExpressionFactory instance;

    private ExpressionFactory() {}

    public static ExpressionFactory getInstance() {
        if (instance == null) {
            instance = new ExpressionFactory();
        }
        return instance;
    }

    public ComplexExpression createExpression(Operation operation, ComplexNumber[] args) {
        return switch (operation) {
            case ADDITION -> new AddComplexExpression(args);
            case SUBTRACTION -> new SubComplexExpression(args);
            case MULTIPLICATION -> new MultiComplexExpression(args);
            case DIVISION -> new DiviComplexExpression(args);
            default -> throw new IllegalArgumentException("Unknown operation");
        };
    }
}