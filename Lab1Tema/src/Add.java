public class Add extends ComplexExpression {
    public Add(ComplexNumber[] numbers) {
        super(numbers, Operation.ADDITION);
    }

    @Override
    public void executeOneOperation() {
        ComplexNumber[] numbers = super.getNumbers();
        ComplexNumber result = numbers[0].add(numbers[1]);
        //shift all elements to the left
        for (int i = 1; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
    }
}
