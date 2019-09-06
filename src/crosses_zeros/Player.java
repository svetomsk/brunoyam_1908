package crosses_zeros;

import java.util.Scanner;

public class Player {
    private char symbol;
    private String name;

    public Player(char symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public int [] makeTurn() {
        System.out.println("Введите координаты:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        return new int[]{x, y};
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}
