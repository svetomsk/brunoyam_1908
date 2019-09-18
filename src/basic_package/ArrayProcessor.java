package basic_package;

import java.util.Scanner;

public class ArrayProcessor {
    public static int[] readArray(Scanner sc) {
        int n = sc.nextInt(); // кол-во элементов
        int[] data = new int[n]; // создаем сами элементы
        for (int i = 0; i < n; i++) { // заполняем массив
            data[i] = sc.nextInt();
        }

        return data;
    }

    public static void printArray(int[] data) {
        System.out.println("Current data:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void max(int[] data) {
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        System.out.println("Max = " + max);
    }

    public static void min(int[] data) {
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (min > data[i]) {
                min = data[i];
            }
        }
        System.out.println("Min = " + min);
    }

    public static void reverse(int[] data) {
        for (int i = 0; i < data.length / 2; i++) {
            int tmp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = tmp;
        }
    }


    public static void addToElement(Scanner sc, int[] data) {
        int value = sc.nextInt();
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] + value;
        }
    }


    /*
    список команд:
    add number [sub nubmer, mul number, div number] - добавляет ко всем элементам число
    min - печатает минимум в массиве
    max - печатает максимум в массиве
    update - просит пользователя заново ввести данные
    reverse - переставляет элементы массива в обратном порядке
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = readArray(sc);

        while (true) {
            String command = sc.next(); // считываем команду
            if (command.equals("q")) {
                break;
            }

            if (command.equals("add")) {
                addToElement(sc, data);
            } else if (command.equals("max")) {
                max(data);
            } else if (command.equals("min")) {
                min(data);
            } else if (command.equals("update")) {
                data = readArray(sc);
            } else if (command.equals("reverse")) {
                reverse(data);
            }

            printArray(data);
        }
    }
}
