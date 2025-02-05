package csc223.jf;

import java.util.Scanner;

public class TicTacToe implements Game {
    private char[] board = {'1','2','3','4','5','6','7','8','9'};
    private boolean gameEnded = false;           
    private int numPlayed = 0;
    private char whoseTurn = 'x';

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    
    }
    
    public void startGame(){
        System.out.println("Game started");
        printBoard();
    }

    public void printBoard(){
        System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "|");
        System.out.println( " - - - - - " );
        System.out.println(board[3] + "|" + board[4] + "|" + board[5] + "|");
        System.out.println( " - - - - - " );
        System.out.println(board[6] + "|" + board[7] + "|" + board[8] + "|");
    }

    public void takeTurn(){
        while (numPlayed < 9 && gameEnded == false){

            printBoard();
            System.out.println("Choose a square from 1-9, player" + whoseTurn);
            var input = scanner.nextInt();

            if (whoseTurn == 'x') 
            {
                whoseTurn = 'o';
            } else {
                whoseTurn = 'x';
            }
            
            // since the board starts with zero, subtract 1 from desired square
            board[input-1] = whoseTurn;
            numPlayed++;

            if (isGameOver()){
                gameEnded = true;
                System.out.println(whoseTurn + "wins");
                return;
            }

            if (whoseTurn == 'X') {
                whoseTurn = 'O';
              } else {
                whoseTurn = 'X';
              }

        }

    }


    public boolean isGameOver(){
        
        //first row
        if (board[0] == whoseTurn && board[1] == whoseTurn && board[2] == whoseTurn){
            return true;
        }

        //second row
        if (board[3] == whoseTurn && board[4] == whoseTurn && board[5] == whoseTurn){
            return true;
        }

        //third row
        if (board[6] == whoseTurn && board[7] == whoseTurn && board[8] == whoseTurn){
            return true;

        }

        //first column
        if (board[0] == whoseTurn && board[3] == whoseTurn && board[6] == whoseTurn){
            return true;
        }

        //second column
        if (board[1] == whoseTurn && board[4] == whoseTurn && board[7] == whoseTurn){
            return true;
        }

        //third column
        if (board[2] == whoseTurn && board[5] == whoseTurn && board[8] == whoseTurn){
            return true;
        }

        //first diagonal
        if (board[0] == whoseTurn && board[4] == whoseTurn && board[8] == whoseTurn){
            return true;
        }

        //second diagonal
        if (board[2] == whoseTurn && board[4] == whoseTurn && board[6] == whoseTurn){
            return true;
        }
        return false;
    }

    public void endGame(){

        if (gameEnded == false && numPlayed == 9){
            printBoard();
            System.out.println("Draw");
        }

    }

    public void playGame(){
        startGame();
        takeTurn();
        endGame();
    }

}