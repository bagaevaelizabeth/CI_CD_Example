package operations;

public enum OperationName {
    ADDITIONAL("Additional"),
    MULTIPLICATION("Multiplication"),
    SUBTRACTION("Subtraction"),
    DIVISION("Division");

    private String name;

    OperationName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
