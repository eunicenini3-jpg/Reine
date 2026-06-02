public class Main {
    public static void main(String[] args) {

        Queen queen = new Queen(new Position(4, 4));

        Position testPosition = new Position(3, 3);

        if (queen.isValidMove(testPosition)) {
            System.out.println("Yes, I can move there.");
        } else {
            System.out.println("Nope, can't do!");
        }
    }
}







