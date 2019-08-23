import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt();
        System.out.println(a);

        int n = 10_000_000;
        int[] mas = new int[n];
        System.out.println(mas[0] + " " + mas[mas.length - 1]);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt();
        }
        long sum = 0;
        for (int i = 0; i < mas.length; i++) {
            // основной рабочий элемент mas[i]
            if (mas[i] > 0) {
                sum = sum + mas[i];
            }
        }
        System.out.println((double) sum / mas.length);
    }
}
