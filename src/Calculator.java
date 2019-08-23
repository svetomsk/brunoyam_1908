import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String op = sc.next();
            if(op.equals("q")) {
                break;
            }
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (op.equals("+")) {
                System.out.println(a + b);
            } else if (op.equals("-")) {
                System.out.println(a - b);
            }
        }

        int result = 0;
        while(true) {
            String op = sc.next();
            if(op.equals("q")) {
                break;
            }
            int c = sc.nextInt();

            if(op.equals("+")) {
                result = result + c;
            } else if(op.equals("*")) {
                result = result * c;
            }
            System.out.println("current result = " + result);
        }
    }
}
