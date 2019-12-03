package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
        
    public static void main(String[] args) throws InterruptedException{
	// write your code here
    }

    public static void testScores(){
        Scanner userInput = new Scanner(System.in);
        DecimalFormat twoPlaces = new DecimalFormat("0.##");

        double percentInput = 0, percentAbove = 0, total = 0, count = 0;


        System.out.print("Enter the first test score (-1 to quit): ");
        percentInput = userInput.nextDouble();
        if(percentInput >= 70){
            total+= percentInput;
            count++;
        }else{
            System.out.println("No scores entered");
        }


        while(percentInput != -1){
            System.out.print("Enter the next test score (-1 to quit): ");
            percentInput = userInput.nextDouble();
            if(percentInput >= 70){
                total+= percentInput;
                count++;
            }
        }

        percentAbove = total / count;
        System.out.println("The average of the scores is: " + twoPlaces.format(percentAbove));
    }
    public static void stringInput() throws InterruptedException{
        Scanner userInput = new Scanner(System.in);
        String input = "";

        System.out.print("Enter a word or sentence:");
        input = userInput.nextLine();

        for(int i = 0; i < input.length(); i+=2){
            System.out.println(input.charAt(i));
            Thread.sleep(250);
        }

    }
}
