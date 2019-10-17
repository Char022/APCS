package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.NumberFormat;
public class Main {

    public static void main(String[] args) {
        massToEnergyCalculator();
        randomAverager();
        changeCalculator();
    }

    public static void massToEnergyCalculator(){
        Scanner user_input = new Scanner(System.in);
        NumberFormat bulbFormat = NumberFormat.getIntegerInstance();

        final double LIGHTSPEED = 300000000;
        final double CSQUARED = LIGHTSPEED * LIGHTSPEED;

        double e, m;

        System.out.println("Enter the mass in kilograms");
        m = user_input.nextDouble();
        e=m*CSQUARED;
        System.out.println("The energy produced in Joules is: " + e);
        System.out.println("The number of lightbulbs powered is: " + bulbFormat.format(e/360000));
    }

    public static void randomAverager(){
        DecimalFormat fourPlaces = new DecimalFormat("0.####");
        DecimalFormat twoPlaces = new DecimalFormat("0.##");

        double randomOne, randomTwo, randomThree;
        double sum, average;

        randomOne = (Math.random() * 151 - 251);
        randomTwo = (Math.random() * 151 + 100);
        randomThree = (Math.random() * 19 + 3);

        sum = randomOne + randomTwo + randomThree;
        average = sum / 3;

        System.out.println("Random Number 1: " + (int) randomOne);
        System.out.println("Random Number 2: " + (int) randomTwo);
        System.out.println("Random Number 3: " + (int) randomThree);

        System.out.println("Sum: " + fourPlaces.format(sum));
        System.out.println("Average: " + twoPlaces.format(Math.abs(average)));

    }

    public static void changeCalculator(){
        Scanner userInput = new Scanner(System.in);

        int change;
        int quarters, dimes, nickels, pennies;

        System.out.print("Enter the change in cents: ");
        change = userInput.nextInt();

        quarters = change / 25;
        change = change % 25;

        dimes = change / 10;
        change = change % 10;

        nickels = change / 5;
        change = change % 5;

        pennies = change;

        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }




}
