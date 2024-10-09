import complexExpression.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // 2 + 3 * i + 5 - 6 * i + -2 + i
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti expresia: ");
        String expr = scanner.nextLine();
        try {
            ExpressionParser parser = new ExpressionParser();
            ComplexExpression expression = parser.parse(expr);
            ComplexNumber result = expression.execute();
            System.out.println("Rezultatul expresiei este: " + result);
        } catch (Exception e) {
            System.out.println("Expresie invalida");
        }

    }
}