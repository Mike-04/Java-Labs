public class DiviComplexExpression extends ComplexExpression {
    public DiviComplexExpression(ComplexNumber[] numbers) {
        super(numbers, Operation.DIVISION);
    }

    @Override
    public ComplexNumber executeOneOperation(ComplexNumber n1, ComplexNumber n2) {
        return n1.divide(n2);
    }
}
