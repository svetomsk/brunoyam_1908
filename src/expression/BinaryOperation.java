package expression;

import java.io.Serializable;
import java.util.Map;

public abstract class BinaryOperation implements Expression {
    private Expression first;
    private Expression second;

    public BinaryOperation(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int calculate(Map<String, Integer> values) {
        int a = first.calculate(values);
        int b = second.calculate(values);
        return operation(a, b);
    }

    public abstract int operation(int a, int b);
}
