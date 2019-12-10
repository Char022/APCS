package com.company;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
        
    public static void main(String[] args) throws InterruptedException {
        // write your code here
        guessingGame();
        song();
    }
    public static void song() throws InterruptedException {
        Scanner userInput = new Scanner(System.in);
        int verses = 0, bottleLeft = 100;
        System.out.print("Enter the number of verses to sing: ");
        verses = userInput.nextInt();

        while(bottleLeft > 100 - verses){
            System.out.println(bottleLeft + " bottles of coke on the wall");
            sleep(600);
            System.out.println(bottleLeft + " bottles of coke");
            sleep(600);
            System.out.println("If one of those bottles should happen to fall");
            sleep(600);
            bottleLeft--;
            for(int i = 0; i < 3; i ++) {
                System.out.println("");
                sleep(200);
            }
        }
    }

    public static void guessingGame() throws InterruptedException {
        Scanner userInput = new Scanner(System.in);

        int randomNumber = (int)(Math.random() * 100) + 1;
        int score = 100, guessesLeft = 10, userGuess = 0;

        System.out.print("Enter a number between 1 and 100 (-1 to quit): ");
        userGuess = userInput.nextInt();

        while(userGuess != randomNumber && guessesLeft > 1 && userGuess != -1){
            if(userGuess > randomNumber){
                System.out.println("Too high!");
            }else{
                System.out.println("Too low!");
            }
            guessesLeft--;
            score -= 10;
            System.out.println("Enter a number between 1 and 100 (-1 to quit: ): You have " + guessesLeft + " left");
            userGuess = userInput.nextInt();
        }

        if(userGuess == randomNumber){
            System.out.println("Correct!");
            System.out.println("You had " + guessesLeft + " guesses. Your score is: " + score + " pts.");
        }
        if(guessesLeft == 1){
            System.out.print("You LOST! Would you like to play again?");
            guessingGame();
        }
        if(userGuess == -1){
            System.out.println("You had " + guessesLeft + " guesses left. Your score is: 0 pts.");
        }
    }

}

