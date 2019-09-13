package expression;

public class Plus extends BinaryOperation {
    public Plus(Expression first, Expression second) {
        super(first, second);
    }

    @Override
    public int operation(int a, int b) {
        return a + b;
    }
}
