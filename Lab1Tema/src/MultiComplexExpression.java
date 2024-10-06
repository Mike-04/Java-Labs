public class MultiComplexExpression extends ComplexExpression {
    public MultiComplexExpression(ComplexNumber[] numbers) {
        super(numbers, Operation.MULTIPLICATION);
    }

    @Override
    public ComplexNumber executeOneOperation(ComplexNumber n1, ComplexNumber n2) {
        return n1.multiply(n2);
    }
}
