package com.company;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
        
    public static void main(String[] args) throws InterruptedException {
        // write your code here
        Scanner userInput = new Scanner(System.in);
        int difficulty = 0, numberOfQuestions = 0;

        System.out.println("Welcome to the Brownsville Math Tutor Program!");
        System.out.print("Enter 1 for EASY or 2 for HARD: ");

        difficulty = userInput.nextInt();

        System.out.print("Enter the number of questions: ");
        numberOfQuestions = userInput.nextInt();

        if (numberOfQuestions == 0) {
            System.out.println("Bye then");
        } else {
            switch (difficulty) {
                case 1:
                    easyMode(numberOfQuestions);
                    break;
                case 2:
                    hardMode(numberOfQuestions);
                    break;
                default:
                    System.out.println("no");
                    break;
            }
        }
    }



    public static void easyMode(double numberOfQuestions){
        Scanner userInput = new Scanner(System.in);
        Random randomNum = new Random();
        NumberFormat percent = NumberFormat.getPercentInstance();
        int userAnswer = 0, randomOne = 0, randomTwo = 0;
        double questionsCorrect = 0, average = 0;

        for(int i  = 1; i <= numberOfQuestions; i++){
            randomOne = randomNum.nextInt(10)+1;
            randomTwo = randomNum.nextInt(10)+1;

            System.out.print(i + ". What is: " + randomOne + " + " + randomTwo + "?\t");
            userAnswer = userInput.nextInt();

            if(userAnswer == randomOne + randomTwo){
                System.out.println("CORRECT!");
                questionsCorrect++;
            }else{
                System.out.println("WRONG, the answer is " + (randomOne + randomTwo));
            }
        }

        average = questionsCorrect / numberOfQuestions;

        System.out.println("You got a total of " + (int)questionsCorrect + " correct answers.");
        System.out.println("Level of Difficulty: EASY");
        System.out.println("Total Questions: " + (int)numberOfQuestions);
        System.out.println("Average: " + percent.format(average));
        letterGrade(average);
    }

    public static void hardMode(double numberOfQuestions){
        Scanner userInput = new Scanner(System.in);
        Random randomNum = new Random();
        NumberFormat percent = NumberFormat.getPercentInstance();
        int userAnswer = 0, randomOne = 0, randomTwo = 0;
        double questionsCorrect = 0, average = 0;

        for(int i  = 1; i <= numberOfQuestions; i++){
            randomOne = randomNum.nextInt(11)+10;
            randomTwo = randomNum.nextInt(11)+10;

            System.out.print(i + ". What is: " + randomOne + " * " + randomTwo + "?\t");
            userAnswer = userInput.nextInt();

            if(userAnswer == randomOne * randomTwo){
                System.out.println("CORRECT!");
                questionsCorrect++;
            }else{
                System.out.println("WRONG, the answer is " + (randomOne * randomTwo));
            }
        }

        average = questionsCorrect / numberOfQuestions;

        System.out.println("You got a total of " + (int)questionsCorrect + " correct answers.");
        System.out.println("Level of Difficulty: HARD");
        System.out.println("Total Questions: " + (int)numberOfQuestions);
        System.out.println("Average: " + percent.format(average));
        letterGrade(average);
    }

    public static void letterGrade(double inputNumber){
        char letterGrade = 0;
        inputNumber *= 100;
        if(inputNumber >= 90){
            letterGrade = 'A';
        }else if(inputNumber >= 80){
            letterGrade = 'B';
        }else if(inputNumber >= 70){
            letterGrade = 'C';
        }else if(inputNumber >= 60){
            letterGrade = 'D';
        }else{
            letterGrade = 'F';
        }

        System.out.println("Letter Grade: " + letterGrade);
    }



}

