package crosses_zeros;

public class Field {
    public static final char EMPTY = '_';
    public static final char CROSS = 'X';
    public static final char ZERO = '0';
    public static final int DEFAULT_SIZE = 3;

    private char[][] data;

    public Field() {
        data = new char[DEFAULT_SIZE][DEFAULT_SIZE];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = EMPTY;
            }
        }
    }

    public boolean setValue(int x, int y, char value) {
        if (data[x][y] == EMPTY) {
            data[x][y] = value;
            return true;
        }
        return false;
    }

    public char checkWinner() {
        for (int i = 0; i < data.length; i++) {
            if (data[i][0] == data[i][1] && data[i][1] == data[i][2] &&
                    data[i][2] != EMPTY) {
                return data[i][0];
            }
            if (data[0][i] == data[1][i] && data[1][i] == data[2][i] &&
                    data[2][i] != EMPTY) {
                return data[0][i];
            }
        }

        if (data[0][0] == data[1][1] && data[1][1] == data[2][2] &&
                data[2][2] != EMPTY) {
            return data[0][0];
        }
        if (data[0][2] == data[1][1] && data[1][1] == data[2][0] &&
                data[2][0] != EMPTY) {
            return data[1][1];
        }
        return EMPTY;
    }

    public boolean isFieldFull() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j] == EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    public void printField() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
