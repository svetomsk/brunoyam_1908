package expression;

import java.util.HashMap;
import java.util.Map;

public class ExpressionTest {
    public static void main(String[] args) {
//        Const five = new Const(123);
//        Const ten = new Const(10);
////        Variable x = new Variable("x");
//        Plus plus = new Plus(x, ten);

//
//        Expression two = new Const(2);
//        values.put("y", 2);
//        System.out.println(plus.calculate(values));


        Variable x = new Variable("x");
        Const two = new Const(2);
        Const four = new Const(4);
        Mul x2 = new Mul(x, x);
        Mul x3 = new Mul(x, x2);
        Mul doubleX = new Mul(two, x);
        Minus x2_minus_x3 = new Minus(x2, x3);
        Plus plus = new Plus(x2_minus_x3, doubleX);
        Minus root = new Minus(plus, four);

        Map<String, Integer> values = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i = -100; i < 100; i++) {
            values.put("x", i);
            max = Math.max(max, root.calculate(values));
        }
        System.out.println(max);
    }
}
