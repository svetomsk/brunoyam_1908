package crosses_zeros;

public class Controller {
    public void startGame() {
        Player first = new Player(Field.CROSS, "First player");
        Player second = new Player(Field.ZERO, "Second player");
        Field field = new Field();

        Player currentPlayer = first;
        while(true) {
            field.printField();
            int [] coords = currentPlayer.makeTurn();
            int row = coords[0];
            int column = coords[1];
            // TODO: correct action on wrong coordinates
            if (!field.setValue(row, column, currentPlayer.getSymbol())) {
                System.out.println("Попробуйте еще раз");
                continue;
            }

            if(currentPlayer.getSymbol() == first.getSymbol()) {
                currentPlayer = second;
            } else {
                currentPlayer = first;
            }

            // TODO: check for winner
            char result = field.checkWinner();
            if(result != Field.EMPTY) {
                System.out.println(result + " win");
                break;
            }
            if(field.isFieldFull()) {
                System.out.println("Draw");
                break;
            }
        }

        // second player goes
//        field.printField();
//        coords = currentPlayer.makeTurn();
//        row = coords[0];
//        column = coords[1];
//        if(field.setValue(row, column, currentPlayer.getSymbol())) {
//            System.out.println("Turn successful");
//        } else {
//            System.out.println("Turn failed");
//        }
//
//        field.printField();
    }
}
