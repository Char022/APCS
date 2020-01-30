package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws InterruptedException{
	// write your code here
        final double PENNY = .01;
        final double NICKEL = .05;
        final double DIME = .10;
        final double QUARTER = .25;

        PiggyBank piggyBank = new PiggyBank();
        Scanner userInput = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        int choice;
        double amount;

        System.out.println("\n1. Show total in bank.");
        System.out.println("2. Add a penny.");
        System.out.println("3. Add a nickel.");
        System.out.println("4. Add a dime.");
        System.out.println("5. Add a quarter.");
        System.out.println("6. Take money out of the bank");
        System.out.println("Enter 0 to quit.");
        System.out.print("Enter your choice: ");

        choice = userInput.nextInt();

        while(choice != 0){
            switch (choice){
                case 1:
                    System.out.println("You have: " + money.format(piggyBank.giveTotal()) + "\n");
                    break;
                case 2:
                    piggyBank.addCoin(PENNY);
                    break;
                case 3:
                    piggyBank.addCoin(NICKEL);
                    break;
                case 4:
                    piggyBank.addCoin(DIME);
                    break;
                case 5:
                    piggyBank.addCoin(QUARTER);
                    break;
                case 6:
                    System.out.println("How much money do you want to take out? ");
                    amount = userInput.nextDouble();
                    piggyBank.removeCoins(amount);
                    System.out.println("You now have: " + money.format(piggyBank.giveTotal()) + "\n");
                    break;
                default:
                    System.out.println("Choose a valid option");
                    break;
            }

            System.out.println("\n1. Show total in bank.");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel.");
            System.out.println("4. Add a dime.");
            System.out.println("5. Add a quarter.");
            System.out.println("6. Take money out of the bank");
            System.out.println("Enter 0 to quit.");
            System.out.print("Enter your choice: ");

            choice = userInput.nextInt();
        }


    }
}

