package basic_package;

public class Field {
    char [][] data;
    int x;
    int y;

    public Field(int rows, int columns) {
        data = new char[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = '-';
            }
        }
        data[x][y] = '#';
    }

    public void moveRight(int distance) {
        data[x][y] = '-';
        if(y + distance < data[0].length) {
            y += distance;
        } else {
            y = data[0].length - 1;
        }
        data[x][y] = '#';
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

class RunField {
    public static void main(String[] args) {
        Field f = new Field(5, 5);
        f.printField();
        f.moveRight(3);
        f.printField();
    }
}