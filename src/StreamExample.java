import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(2);
        data.add(1);
        data.add(3);
        data.add(4);
        data.add(51);
        data.add(5);

        for (int i = 0; i < data.size(); i++) {
            data.set(i, data.get(i) + 1);
        }
        System.out.println(data);

        data = data.stream()
                .map(x -> x + 1)
                .filter(x -> x < 10 && x > 1)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(data);
    }
}
