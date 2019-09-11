package collections_example;

import java.util.*;

public class ListsExample {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> list = new LinkedList<> ();
        System.out.println(array);
        System.out.println("Start size " + array.size());
        int n = 100;
        for (int i = 0; i < n; i++) {
            array.add(i);
            list.add(i);
        }
        System.out.println(array);
        // mas[10] = 100;
        array.set(10, 123);
        System.out.println(array);
        // if(mas[10] > 100) {
        if(array.get(10) > 100) {
            System.out.println("Yes");
        }


        n = 100000;
        long start = System.currentTimeMillis();
        for(int i = 0; i < n; i++) {
            array.add(0, i);
        }
        System.out.println("Array time = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for(int i = 0; i < n; i++) {
            list.add(0, i);
        }
        System.out.println("List time = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            array.set(i, i * i);
        }
        System.out.println("Array time = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.set(i, i * i);
        }
        System.out.println("List time = " + (System.currentTimeMillis() - start));

//        for (int i = 0; i < list.size(); i++) {
//            Integer el = list.get(i);
        for(Integer element : list) {

        }

        int [] mas = new int[100];
        for(int k : mas) {

        }
    }
}
