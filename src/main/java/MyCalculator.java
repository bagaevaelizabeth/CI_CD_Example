import operations.*;

import static operations.OperationName.ADDITIONAL;

public class MyCalculator {

    public double calculate(double a, double b, OperationName operation) {
        switch (operation) {
            case ADDITIONAL -> {
                Addition addition = new Addition();
                return addition.perform(a, b);
            }
            case SUBTRACTION -> {
                Subtraction subtraction = new Subtraction();
                return subtraction.perform(a, b);
            }
            case MULTIPLICATION -> {
                Multiplication multiplication = new Multiplication();
                return multiplication.perform(a, b);
            }
            case DIVISION -> {
                Division division = new Division();
                return division.perform(a, b);
            }

            default -> throw new IllegalArgumentException("Wrong operation" + operation.toString());
        }
    }

    public static void main(String[] argv) {
        MyCalculator calculator = new MyCalculator();
        System.out.println(calculator.calculate(4, 6, ADDITIONAL));
    }
}
