package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
        
    public static void main(String[] args) throws InterruptedException{
	// write your code here
        multiplicationTable();
        slotMachine();
        guessingGame();
    }
    public static void awards(){
        Scanner userInput = new Scanner(System.in);
        double gpa = 0;

        System.out.printf("Enter GPA");
        gpa = userInput.nextDouble();

        if(gpa >= 3.8){
            System.out.println("Magna cum laude");
        }else if(gpa >= 3.65){
            System.out.println("Summa cum laude");
        }else if(gpa >= 3.5){
            System.out.println("Cum laude");
        }else{
            System.out.println("No awards");
        }
    } //test
    public static void average(){
        int sum = 0, value, count = 0;
        double average;
        Scanner userInput = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.###");

        System.out.println("Enter an integer (0 to quit)");
        value = userInput.nextInt();

        while(value != 0){
            count++;

            sum += value;
            System.out.println("The sum so far " + sum);

            System.out.println("Enter an integer (0 to quit)");
            value = userInput.nextInt();
        }

        System.out.println();
        System.out.println("Number of values entered " + count);

        if(count != 0) {
            average = (double) sum / count;
            System.out.println("The average is " + format.format(average));
        }else{
            System.out.println("There were no values entered");
        }

    }
    public static void leapYear(int year) {
        if (year < 1582) {
            System.out.println("No");
        } else {
            if ((year % 4) == 0) {
                if ((year % 100) == 0) {
                    if ((year % 400) == 0) {
                        System.out.println("It is a leap year");
                    } else {
                        System.out.println("It is not a leap year");
                    }
                } else {
                    System.out.println("It is a leap year");
                }
            } else {
                System.out.println("It is not a leap year");
            }
        }
    }
    public static void badLeapYear(){
        Scanner userInput = new Scanner(System.in);
        int year = 0;

        System.out.println("Enter the year");
        year = userInput.nextInt();
        leapYear(year);
    }
    public static void goodLeapYear(){
        Scanner userInput = new Scanner(System.in);
        int year = 0;

        while(year != 22) {
            System.out.println("Enter the year (22 to quit)");
            year = userInput.nextInt();
            leapYear(year);
        }
    }
    public static void evenCounter(){
        Scanner userInput = new Scanner(System.in);
        int input = 0;

        System.out.println("Enter a number greater than 2");
        input = userInput.nextInt();
        if(input < 2){
            System.out.println("No");
            System.out.println(0 / (input - input));
        }

        for(int i = 2; i <= input; i+=2) {
            System.out.println(i);
        }
    }
    public static void characterPerLine() throws InterruptedException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Say something");
        String input = userInput.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
            Thread.sleep(250);
        }
    }

    public static void multiplicationTable(){
        for(int i = 1; i <= 20; i++){
            for(int j = i; j <= 20 * i; j+=i){
                System.out.format("%5s", j);
            }
            System.out.println();
        }
    }
    public static void slotMachine(){
        Scanner userInput = new Scanner(System.in);

        System.out.println((int) (Math.random() * 10) + "   " + (int) (Math.random() * 10) + "   " + (int) (Math.random() * 10));
        System.out.print("Play again?: ");

        while(userInput.nextLine().contains("y")) {
            System.out.println((int) (Math.random() * 10) + "   " + (int) (Math.random() * 10) + "   " + (int) (Math.random() * 10));
            System.out.print("Play again?: ");
        }
    }

    public static void rockPaperScissors(){
        Scanner userInput = new Scanner(System.in);

        int userChoice, machineChoice;

        System.out.print("Enter your throw (1=Rock, 2=Paper, 3=Scissors): ");
        userChoice = userInput.nextInt();

        machineChoice = (int)(Math.random() * 3) + 1;

        System.out.print("Player throws ");
        rockPaperScissors(userChoice);

        System.out.print("Computer throws ");
        rockPaperScissors(machineChoice);

        if(userChoice == 1){
            switch(machineChoice){
                case 1: System.out.println("Tie!"); break;
                case 2: System.out.println("Computer wins!"); break;
                case 3: System.out.println("Player wins!"); break;
                default: break;
            }
        }
        if(userChoice == 2){
            switch(machineChoice){
                case 2: System.out.println("Tie!"); break;
                case 3: System.out.println("Computer wins!"); break;
                case 1: System.out.println("Player wins!"); break;
                default: break;
            }
        }
        if(userChoice == 3){
            switch(machineChoice){
                case 3: System.out.println("Tie!"); break;
                case 1: System.out.println("Computer wins!"); break;
                case 2: System.out.println("Player wins!"); break;
                default: break;
            }
        }
    }

    public static void rockPaperScissors(int input){
        switch(input){
            case 1:
                System.out.println("ROCK");
                break;
            case 2:
                System.out.println("PAPER");
                break;
            case 3:
                System.out.println("SCISSORS");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }

    public static void classworkCounter(){
        final int LIMIT = 5;

        int count = 0;

        while (count < LIMIT) {
            count++;
            System.out.println(count);
        }

        System.out.println("Done!");
    }

    public static void guessingGame(){
        String answer = "BRAIN";
        System.out.println("word guess");
        System.out.println("-----");
        Scanner userInput = new Scanner(System.in);
        String previousOutput = "-----";
        int score = 100;

        String userGuess;
        boolean isFinished = false;
        while(!isFinished){
            System.out.println("enter guess");
            userGuess = userInput.nextLine();
            for(int i = 0; i < answer.length(); i++){
                if(userGuess.charAt(0) == answer.charAt(i)){
                    System.out.print(userGuess.charAt(0));
                    String newPreviousOutput = "";
                    for(int j = 0; j < previousOutput.length(); j++){
                        if(j == i){
                            newPreviousOutput += userGuess.charAt(0);
                        }else{
                            newPreviousOutput += previousOutput.charAt(j);
                        }
                    }
                    previousOutput = newPreviousOutput;
                }else{
                    System.out.print(previousOutput.charAt(i));
                }
            }
            System.out.println("");
            if(answer.contains(userGuess) && previousOutput.contains(userGuess) || userGuess.charAt(0) == '!'){}else{
                score -= 10;
            }
            if(userGuess.charAt(0) == '!'){
                System.out.println("Guess");
                if(userInput.nextLine().equals(answer)){
                    System.out.println("you win");
                    System.out.println("score " + score);
                }else{
                    System.out.println("you lose");
                }
                isFinished = true;
            }
            if(score <= 0 || previousOutput.equals(answer)) {
                if (isFinished) {
                } else {
                    isFinished = true;
                    if (previousOutput.equals(answer)) {
                        System.out.println("you win");
                        System.out.println("score " + score);
                    } else {
                        System.out.println("you lose");
                    }
                }
            }
        }
        System.out.println("answer was " + answer);
    }
}

