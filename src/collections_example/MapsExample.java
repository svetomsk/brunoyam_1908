package collections_example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsExample {
    public static void main(String[] args) {
        try {
            action();
        } catch (NullPointerException exception) {
            System.out.println(exception.getCause());
        }
        System.out.println("Program code");
        try {
            checkedException();
        } catch (FileNotFoundException e) {
            System.out.println("File not found :(");
        }
    }


    public static void action() {
        Map<Integer, String> clients = new HashMap<>();
        clients.put(1, "Ivan Ivanov");
        clients.put(2, "Sidr Sidorov");
        System.out.println(clients);
        clients.put(2, "Will Smith");
        System.out.println(clients);
        clients.putIfAbsent(2, "Changed Name");
        System.out.println(clients);

        String foundValue = clients.get(1);
        System.out.println("Found " + foundValue);
        String notFoundValue = clients.get(100);
        System.out.println("Not found " + notFoundValue.length());
        String defaultValue = clients.getOrDefault(100, "Default value");
        System.out.println(defaultValue);

        System.out.println(clients.keySet());
        System.out.println(clients.values());
    }

    public static void checkedException () throws FileNotFoundException {
        Scanner sc = new Scanner(new File("inpout.txt"));
    }
}
