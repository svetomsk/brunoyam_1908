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

        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        System.out.println(a + b + c);
    }
}
