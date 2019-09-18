package basic_package;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Введите имя:");
//        String input = sc.nextLine();
//        System.out.println("Привет, " + input);
        // > Введите имя:
        // > Иван
        // > Привет, Иван!

        String operation = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(operation);
    }
}
