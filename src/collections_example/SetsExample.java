package collections_example;

import java.util.*;

public class SetsExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers.add(3));
        System.out.println(numbers);
        System.out.println(numbers.add(3));
        System.out.println(numbers);

        System.out.println(numbers.contains(2));
        System.out.println(numbers.contains(4));

        Scanner sc = new Scanner(System.in);
        Set<String> inputs = new HashSet<>();
//        while(true) {
//            String s = sc.nextLine();
//            if(s.equals("exit")) {
//                break;
//            }
//            inputs.add(s);
//            System.out.println(inputs);
//        }
        System.out.println(inputs);

        List<String> arrayInputs = new ArrayList<>(inputs);


        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(3);
        Set<Integer> setData = new HashSet<>();
        setData.addAll(numbers);
        if(data.size() == setData.size()) {
            System.out.println("All different");
        } else {
            System.out.println("Some repeats");
        }


    }
}
