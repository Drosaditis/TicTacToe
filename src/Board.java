public class Board {
    public static void print(char [][] gameBoard){

        for(char[] row : gameBoard){
            for( char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void update( int position, int player, char [][] gameBoard){

        char character;

        if(player==1){
            character = 'X';
        }else{
            character = 'O';
        }

        switch (position){

            case 1:
                gameBoard[0][0] = character;
                break;
            case 2:
                gameBoard[0][2] = character;
                break;
            case 3:
                gameBoard[0][4] = character;
                break;
            case 4:
                gameBoard[1][0] = character;
                break;
            case 5:
                gameBoard[1][2] = character;
                break;
            case 6:
                gameBoard[1][4] = character;
                break;
            case 7:
                gameBoard[2][0] = character;
                break;
            case 8:
                gameBoard[2][2] = character;
                break;
            case 9:
                gameBoard[2][4] = character;

                break;
            default:
                break;

        }
        print(gameBoard);
    }
    public static void reset(char [][] gameBoard){
        gameBoard[0][0] = '_';
        gameBoard[0][2] = '_';
        gameBoard[0][4] = '_';
        gameBoard[1][0] = '_';
        gameBoard[1][2] = '_';
        gameBoard[1][4] = '_';
        gameBoard[2][0] = ' ';
        gameBoard[2][2] = ' ';
        gameBoard[2][4] = ' ';

    }
}
