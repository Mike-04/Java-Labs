import complexExpression.*;

import java.util.ArrayList;

public class ExpressionParser {
    public ComplexExpression parse(String in) {
        // transform i into 1 * i if its not preceded by *
        in = in.replaceAll("(?<!\\*) i", " 1 * i");
        // stick all i's to the numbers
        in = in.replaceAll(" \\* i", "i");
        // Split the input string into complex numbers and operators
        String[] input = in.split(" ");
        for (String s : input) {
            System.out.println(":"+s+":");
            if (!s.matches("[-+]?[0-9]+i?") && !s.matches("[+\\-*/]"))
             {
                throw new IllegalArgumentException("Invalid expression");
            }
        }
        ComplexNumber[] args = extractComplexNumbers(input);
        Operation op = extractOperation(input);
        return ExpressionFactory.getInstance().createExpression(op, args);
    }

    private Operation extractOperation(String[] input) {
        String op = input[3];
        // check if every 4th element is the same operator
        for (int i = 7; i < input.length; i += 4) {
            if (!input[i].equals(op)) {
                throw new IllegalArgumentException("Invalid expression");
            }
        }
        return switch (op) {
            case "+" -> Operation.ADDITION;
            case "-" -> Operation.SUBTRACTION;
            case "*" -> Operation.MULTIPLICATION;
            case "/" -> Operation.DIVISION;
            default -> throw new IllegalArgumentException("Unknown operation");
        };
    }


    private ComplexNumber[] extractComplexNumbers(String[] input) {
        // a complex number is made from 3 substrings in the input array
        // every 4th element is an operator
        ArrayList<ComplexNumber> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i += 4) {
            double real = Double.parseDouble(input[i]);
            //imaginary part ends with i so we need to remove it
            input[i + 2] = input[i + 2].substring(0, input[i + 2].length() - 1);
            double imag = Double.parseDouble(input[i + 2]);
            if (input[i + 1].equals("-")) {
                imag = -imag;
            }
            numbers.add(new ComplexNumber(real, imag));
        }
        return numbers.toArray(new ComplexNumber[0]);
    }

}