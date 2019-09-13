package expression;

import java.util.Map;

public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int calculate(Map<String, Integer> values) {
        return values.getOrDefault(name, 1);
    }
}
