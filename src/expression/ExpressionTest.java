package expression;

import java.util.HashMap;
import java.util.Map;

public class ExpressionTest {
    public static void main(String[] args) {
        Const five = new Const(123);
        Const ten = new Const(10);
        Variable x = new Variable("x");
        Plus plus = new Plus(x, ten);
        Map<String, Integer> values = new HashMap<>();
        values.put("x", 15);

        Expression two = new Const(2);
        values.put("y", 2);
        System.out.println(plus.calculate(values));
    }
}
