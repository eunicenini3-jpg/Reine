public class Main {
    public static void main(String[] args) {
        Reine reine = new Reine();

        // Position actuelle de la reine
        reine.position = new Position();
        reine.position.row = 4;
        reine.position.column = 4;

        // Nouvelle position à tester
        Position newPos = new Position();
        newPos.row = 6;
        newPos.column = 6;

        // Affichage du résultat
        System.out.println(reine.isValidMove(newPos));
    }
}

class Piece {
    Position position;
    boolean isValidMove(Position newPosition){
        if (newPosition.row>0 && newPosition.column>0
                && newPosition.row<=8 && newPosition.column<=8) {
            return true;
        }else {
            return false;
        }
    }}

class Reine extends Piece {
    @Override
    boolean isValidMove(Position newPosition) {

        //  vérifier si c'est dans le plateau
        if (!super.isValidMove(newPosition)) {
            return false;
        }

        // déplacement diagonal, éplacement vertical et déplacement horizontal
        if ((Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row)) || (newPosition.column == this.position.column) || (newPosition.row == this.position.row)) {
            return true;
        } else {
            return false;
        }
    }
}

class Position{
    int row;
    int column;
}
