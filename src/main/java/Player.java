import java.util.Scanner;

public class Player {

    Scanner scanner = new Scanner(System.in);
    char selectedPlace;
    int row ;
    int column;

    public void getPlayerInput(char[][]board, char activePlayer, int row, int column) throws BusyFieldException {
        boolean correctMove=false;

        while (!correctMove) {

            if (board[row][column] == 'X'||board[row][column] == 'O'){
                throw new BusyFieldException();
            } else {
               // if (board[row][column] == ' ') {
                board[row][column] = activePlayer;
                selectedPlace = board[row][column];
                correctMove=true;
            }
        }
    }



    public void playerValidatedInput(char activePlayer){

        boolean validated;
        System.out.println("Player "+activePlayer+" Enter row number:");
        do {
            row= scanner.nextInt();
            if ((row > -1) && (row < 10)) {
                validated = true;
            } else {
                System.out.println("Only numbers 0 - 9, enter row number:");
                validated = false;
            }
        } while (!validated);


        System.out.println("Player "+activePlayer+" Enter column number:");
        do {
            column= scanner.nextInt();
            if ((column > -1) && (column < 10)) {
                validated = true;
            } else {
                System.out.println("Only numbers 0 - 9, enter column number:");
                validated = false;
            }
        } while (!validated);
    }




}
