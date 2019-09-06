package crosses_zeros;

import java.util.Random;

public class RandomPlayer extends Player {
    public RandomPlayer(char symbol, String name) {
        super(symbol, name);
    }

    @Override
    public int[] makeTurn(Field f) {
        Random r = new Random();
        return new int[]{r.nextInt(3), r.nextInt(3)};
    }
}
