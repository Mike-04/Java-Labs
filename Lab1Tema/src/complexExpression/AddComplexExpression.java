package complexExpression;


public class AddComplexExpression extends ComplexExpression {
    public AddComplexExpression(ComplexNumber[] numbers) {
        super(numbers, Operation.ADDITION);
    }

    @Override
    public ComplexNumber executeOneOperation(ComplexNumber n1, ComplexNumber n2) {
        return n1.add(n2);
    }
}
