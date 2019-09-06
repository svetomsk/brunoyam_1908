package crosses_zeros;

import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(char symbol, String name) {
        super(symbol, name);
    }

    @Override
    public int[] makeTurn(Field f) {
        System.out.println("Введите координаты:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        return new int[]{x, y};
    }
}
