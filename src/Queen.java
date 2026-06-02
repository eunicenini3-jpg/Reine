public class Queen extends Piece {

    public Queen(Position position) {
        this.position = position;
    }

    @Override
    boolean isValidMove(Position newPosition) {

        if (!super.isValidMove(newPosition)) {
            return false;
        }

        return (Math.abs(newPosition.column - this.position.column)
                == Math.abs(newPosition.row - this.position.row))
                || (newPosition.column == this.position.column)
                || (newPosition.row == this.position.row);
    }
}


