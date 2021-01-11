public class Checks {
    public static boolean isValidMove(int move, char[][] gameBoard){

        switch (move){
            case 1:
                return gameBoard[0][0] == '_';
            case 2:
                return gameBoard[0][2] == '_';
            case 3:
                return gameBoard[0][4] == '_';

            case 4:
                return gameBoard[1][0] == '_';
            case 5:
                return gameBoard[1][2] == '_';
            case 6:
                return gameBoard[1][4] == '_';
            case 7:
                return gameBoard[2][0] == ' ';
            case 8:
                return gameBoard[2][2] == ' ';
            case 9:
                return gameBoard[2][4] == ' ';

            default:
                return false;
        }

    }


    public static boolean isGameOver(char [][] gameBoard){

        //Horizontal Win
        if(gameBoard[0][0] == 'X'&& gameBoard[0][2] == 'X' && gameBoard [0][4] == 'X' ){
            System.out.println("Player Wins");
            TicTacToe.playerScore++;
            return true;
        }
        if(gameBoard[0][0] == 'O'&& gameBoard[0][2] == 'O' && gameBoard [0][4] == 'O' ){
            System.out.println("Computer Wins");
            TicTacToe.computerScore++;
            return true;
        }
        if(gameBoard[1][0] == 'X'&& gameBoard[1][2] == 'X' && gameBoard [1][4] == 'X' ){
            System.out.println("Player Wins");
            TicTacToe.playerScore++;
            return true;
        }
        if(gameBoard[1][0] == 'O'&& gameBoard[1][2] == 'O' && gameBoard [1][4] == 'O' ){
            System.out.println("Computer Wins");
            TicTacToe.computerScore++;
            return true;
        }
        if(gameBoard[2][0] == 'X'&& gameBoard[2][2] == 'X' && gameBoard [2][4] == 'X' ){
            System.out.println("Player Wins");
            TicTacToe.playerScore++;
            return true;
        }
        if(gameBoard[2][0] == 'O'&& gameBoard[2][2] == 'O' && gameBoard [2][4] == 'O' ) {
            System.out.println("Computer Wins");
            TicTacToe.computerScore++;
            return true;
        }

        //Vertical Wins

        if(gameBoard[0][0] == 'X'&& gameBoard[1][0] == 'X' && gameBoard [2][0] == 'X' ){
            System.out.println("Player Wins");
            TicTacToe.playerScore++;
            return true;
        }
        if(gameBoard[0][0] == 'O'&& gameBoard[1][0] == 'O' && gameBoard [2][0] == 'O' ){
            System.out.println("Computer Wins");
            TicTacToe.computerScore++;
            return true;
        }

        if(gameBoard[0][2] == 'X'&& gameBoard[1][2] == 'X' && gameBoard [2][2] == 'X' ){
            System.out.println("Player Wins");
            TicTacToe.playerScore++;
            return true;
        }
        if(gameBoard[0][2] == 'O'&& gameBoard[1][2] == 'O' && gameBoard [2][2] == 'O' ){
            System.out.println("Computer Wins");
            TicTacToe.computerScore++;
            return true;
        }

        if(gameBoard[0][4] == 'X'&& gameBoard[1][4] == 'X' && gameBoard [2][4] == 'X' ){
            System.out.println("Player Wins");
            TicTacToe.playerScore++;
            return true;
        }
        if(gameBoard[0][4] == 'O'&& gameBoard[1][4] == 'O' && gameBoard [2][4] == 'O' ){
            System.out.println("Computer Wins");
            TicTacToe.computerScore++;
            return true;
        }

        //Diagonal Wins
        if(gameBoard[0][0] == 'X'&& gameBoard[1][2] == 'X' && gameBoard [2][4] == 'X' ){
            System.out.println("Player Wins");
            TicTacToe.playerScore++;
            return true;
        }
        if(gameBoard[0][0] == 'O'&& gameBoard[1][2] == 'O' && gameBoard [2][4] == 'O' ){
            System.out.println("Computer Wins");
            TicTacToe.computerScore++;
            return true;
        }

        if(gameBoard[2][0] == 'X'&& gameBoard[1][2] == 'X' && gameBoard [0][4] == 'X' ){
            System.out.println("Player Wins");
            TicTacToe.playerScore++;
            return true;
        }
        if(gameBoard[2][0] == 'O'&& gameBoard[1][2] == 'O' && gameBoard [0][4] == 'O' ){
            System.out.println("Computer Wins");
            TicTacToe.computerScore++;
            return true;
        }

        if(gameBoard[0][0] != '_' && gameBoard[0][2] != '_' && gameBoard[0][4] != '_' && gameBoard[1][0] !='_'&&
                gameBoard[1][2] != '_' && gameBoard[1][4] != '_' && gameBoard[2][0] != ' ' && gameBoard[2][2] != ' ' && gameBoard[2][4] != ' '){
            System.out.println("Its a tie");
            return true;
        }

        return false;
    }
}

