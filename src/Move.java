import java.util.Random;

public class Move {

    public static void playerMove(char[][] gameBoard){
        System.out.println("Please make a move. (1-9)");

        int move = TicTacToe.input.nextInt();

        boolean result = Checks.isValidMove(move,gameBoard);

        while(!result){
            System.out.println("Sorry! Invalid Move. Try again");
            move = TicTacToe.input.nextInt();
            result = Checks.isValidMove(move,gameBoard);
        }

        System.out.println("Player moved at position " + move);
        Board.update(move,1,gameBoard);
    }

    public static void computerMove(char [][] gameBoard){
        Random rand = new Random();
        int move = rand.nextInt(9)+1;

        boolean result = Checks.isValidMove(move,gameBoard);

        while(!result){
            move = rand.nextInt(9)+1;
            result = Checks.isValidMove(move, gameBoard);
        }

        System.out.println("Computer moved at position "+ move);
        Board.update(move,2,gameBoard);
    }
}
