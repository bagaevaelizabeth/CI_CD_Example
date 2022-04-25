package operations;

public class Division implements Operation{
    @Override
    public double perform(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("divisor should be not 0!");
        }
        return a / b;
    }
}
