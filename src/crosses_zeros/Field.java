package crosses_zeros;

public class Field {
    public static final char EMPTY = '_';
    public static final char CROSS = 'X';
    public static final char ZERO = '0';
    public static final int DEFAULT_SIZE = 3;


    private char [][] data;

    public Field() {
        data = new char[DEFAULT_SIZE][DEFAULT_SIZE];
        for(int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = EMPTY;
            }
        }
    }

//    public Field(int n) {
//
//    }

    public boolean setValue(int x, int y, char value) {
        if(data[x][y] == EMPTY) {
            data[x][y] = value;
            return true;
        }
        return false;
    }

//    public void setValue(int x, int y, char value) {
//        return false;
//    }

//    public char getValue(int x, int y) {
//        return '_';
//    }

    public char checkWinner() {
        return 'X';
    }

    public boolean isFieldFull() { 
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
