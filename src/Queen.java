public class Queen extends Piece{
        @Override
        boolean isValidMove(Position newPosition) {
            //  vérifier si c'est dans le plateau
            if (!super.isValidMove(newPosition)) {
                return false;
            }
            // déplacement diagonal, éplacement vertical et déplacement horizontal
            return (Math.abs(newPosition.column - this.position.column)
                    == Math.abs(newPosition.row - this.position.row))
                    || (newPosition.column == this.position.column)
                    || (newPosition.row == this.position.row);

        }

        }


