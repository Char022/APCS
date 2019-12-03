package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
        
    public static void main(String[] args) throws InterruptedException{
	// write your code here
        multiplicationTable();
        slotMachine();
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
}
