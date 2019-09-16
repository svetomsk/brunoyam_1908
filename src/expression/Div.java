package expression;

public class Div extends BinaryOperation {
    public Div(Expression first, Expression second) {
        super(first, second);
    }

    @Override
    public int operation(int a, int b) {
        return a / b;
    }
}
