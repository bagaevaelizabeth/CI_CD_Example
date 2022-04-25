import org.junit.jupiter.api.Test;

import static operations.OperationName.ADDITIONAL;
import static operations.OperationName.DIVISION;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyCalculatorTest {
    
    @Test
    public void checkAdditional() {
        double a = 10.2;
        double b = 10.8;
        MyCalculator calculator = new MyCalculator();
        double actualValue = calculator.calculate(a, b, ADDITIONAL);
        assertEquals(21, actualValue, 0.0);
    }

    @Test
    public void checkDivision() {
        double a = 8;
        double b = 2;
        MyCalculator calculator = new MyCalculator();
        double actualValue = calculator.calculate(a, b, DIVISION);
        assertEquals(4, actualValue, 0.0);
    }
}
