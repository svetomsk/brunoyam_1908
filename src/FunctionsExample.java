import java.util.List;
import java.util.function.*;

public class FunctionsExample {
    public static void main(String[] args) {
//        Runnable task = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Some work");
//            }
//        };
        Runnable task = () -> {
            System.out.println("Some work");
            System.out.println("More work");
        };
        task.run();

        Supplier<Integer> sup = () -> 123; // Integer sup()
        System.out.println(sup.get());
        System.out.println(foo());

        Consumer<List<Integer>> cons = argument -> System.out.println(argument); // void (List<Integer> arguments)
        BiConsumer<Integer, String> biConsumer = (age, name) -> System.out.println(name + " is " + age + " years old");
        biConsumer.accept(24, "Svetozar");

        Function<Integer, Integer> fun = x -> x + 1; // Integer fun(Integer x)
        System.out.println(fun.apply(123));

        BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
        System.out.println(sum.apply(12, 23));

        Predicate<Integer> predicate = x -> x > 0; // boolean predicate(Integer x)

    }

    public static void checkList(List<Integer> data, Predicate<Integer> p) {
        for(Integer i : data) {
            p.test(i);
        }
    }

    public static void printList(List<Integer> argument) {
        System.out.println(argument);
    }

    public static Integer foo() {
        return 123;
    }

    public static void doSmth(Supplier<Integer> sup) {
        for (int i = 0; i < 10; i++) {
            sup.get();
        }
    }
}
