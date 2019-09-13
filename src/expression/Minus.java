package expression;

import java.util.Map;

public class Minus implements Expression {
    private Expression first;
    private Expression second;

    public Minus(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int calculate(Map<String, Integer> values) {
        int a = first.calculate(values);
        int b = second.calculate(values);
        return a - b;
    }
}
