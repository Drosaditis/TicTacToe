import java.util.Scanner;

public class TicTacToe {

    static int playerScore = 0;
    static int computerScore = 0;
    static Scanner input = new Scanner(System.in);

    public static void StartGame() {

        char[][] gameBoard = {{'_', '|', '_', '|', '_'}, {'_', '|', '_', '|', '_'}, {' ', '|', ' ', '|', ' '}};
        Board.print(gameBoard);
        boolean gameOver = false;
        boolean playAgain = true;

        while (playAgain) {
            while (!gameOver) {
                System.out.println("Welcome to Tic Tac Toe!!");
                Move.playerMove(gameBoard);
                gameOver = Checks.isGameOver(gameBoard);
                if (gameOver) break;

                Move.computerMove(gameBoard);
                gameOver = Checks.isGameOver(gameBoard);
                if (gameOver) break;
            }
            System.out.println("Player Score: " + playerScore);
            System.out.println("Computer Score: " + computerScore);

            boolean flag = false;
            while (!flag) {
                System.out.println("Would you like to play again? Y/N");
                String result = input.nextLine();
                if (result.equals("Y") || result.equals("y")) {
                    System.out.println("Dope! Let's play again");
                    Board.reset(gameBoard);
                    gameOver = false;
                    Board.print(gameBoard);
                    flag = true;
                } else {
                    if (result.equals("N") || result.equals("n")) {
                        playAgain = false;
                        System.out.println("Thanks for playing");
                        flag = true;
                    } else {
                        System.out.println("Not valid.Try typing again!");

                    }
                }
            }
        }
    }
}






























