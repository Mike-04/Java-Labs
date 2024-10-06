public abstract class ComplexExpression {
    enum Operation {
        ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION
    }
    private ComplexNumber[] numbers;
    private Operation operation;

    public ComplexExpression(ComplexNumber[] numbers, Operation operation) {
        this.numbers = numbers;
        this.operation = operation;
    }

    public ComplexNumber execute(){
        // execute all operations
        for (int i = 0; i < numbers.length - 1; i++) {
            executeOneOperation();
        }
        return numbers[1];
    }

    public ComplexNumber[] getNumbers() {
        return numbers;
    }

    public abstract void executeOneOperation();
}

