public abstract class ComplexExpression {

    private ComplexNumber[] numbers;
    private Operation operation;

    public ComplexExpression(ComplexNumber[] numbers, Operation operation) {
        this.numbers = numbers;
        this.operation = operation;
    }

    public ComplexNumber execute() {
        //
        ComplexNumber result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = executeOneOperation(result, numbers[i]);
        }
        return result;
    }

    public ComplexNumber[] getNumbers() {
        return numbers;
    }

    public abstract ComplexNumber executeOneOperation(ComplexNumber n1, ComplexNumber n2);


}
