package basic_package;

public class FunctionsExample {
    public static void main(String[] args) {
        int [] data = {1, 2, 3, 4};
        changeArray(data); // вызов функции
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        int k = summa(1, 2);
    }

    // array = data;
    public static void changeArray(int [] array) {
        int tmp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = tmp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int summa(int a, int b) {
        return a + b;
    }
}
