package csc223.jf;
import java.util.Random;
import java.util.Scanner;

public class WordGuess implements Game {
    //variables
    private String[] words = {"banana", "java", "water", "dog", "computer", "car"};
    private Random word = new Random();
    private int attempts = 5;
    private Scanner scanner = new Scanner(System.in);
    private String chosen;
    private char[] guessWord;

    public static void main(String[] args) {
        WordGuess game = new WordGuess();
        game.playGame();
    }
    
    public void startGame(){
        //selects a random word from the words list
        int randNum = word.nextInt(words.length);
        chosen = words[randNum];
        guessWord = new char[chosen.length()];
        
        //replaces letters in the word with underscores
        for (int i = 0; i < guessWord.length; i++) {
            guessWord[i] = '_';
        }
        System.out.println("Game started");
        printBoard();
    }
    public void printBoard(){
        //prints current word progress + remaining attempts
        System.out.println("Current word:" + new String(guessWord));
        System.out.println("Current attempts:" + attempts);
    }

    public void takeTurn(){
        while (attempts > 0 && isGameOver() == false){
            System.out.println("Select a letter");
            char letter = scanner.next().charAt(0);

            boolean correctLetter = false;

            for (int i =0; i < chosen.length(); i++){
                    if (chosen.charAt(i) == letter){
                        guessWord[i] = letter;
                        correctLetter = true;

                    } 
                    
                if (correctLetter == false){
                    attempts--;
                    System.out.println("Incorrect");
                }       
                
                if (isGameOver() == true){
                    System.out.println("correct, you have guessed" + chosen);
                }
            }

        }
    }

    public boolean isGameOver(){
        return new String(guessWord) == (chosen);
    }

    public void endGame(){
        if (isGameOver() == true){
            System.out.println("You lost, the word was" + chosen);
        }
        
    }
    public void playGame(){
        startGame();
        takeTurn();
        endGame();
    }


}

