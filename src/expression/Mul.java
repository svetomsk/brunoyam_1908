package expression;

public class Mul extends BinaryOperation {
    public Mul(Expression first, Expression second) {
        super(first, second);
    }

    @Override
    public int operation(int a, int b) {
        return a * b;
    }
}
