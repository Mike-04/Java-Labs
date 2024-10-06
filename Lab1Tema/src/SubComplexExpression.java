public class SubComplexExpression extends ComplexExpression {
    public SubComplexExpression(ComplexNumber[] numbers) {
        super(numbers, Operation.SUBTRACTION);
    }

    @Override
    public ComplexNumber executeOneOperation(ComplexNumber n1, ComplexNumber n2) {
        return n1.subtract(n2);
    }
}
