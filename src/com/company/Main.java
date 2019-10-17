package com.company;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class Main {
        
    public static void main(String[] args) {
	// write your code here
        //Task numbers are off because I didn't start creating new branches for each chapter until after the chapter 2 test
        //Also what the heck is in here you forgot? This is bad code, mostly review
        //Anddddd I'm talking to my future self through computer comments. Great
    }
    public static void Task5(){
        Scanner user_input = new Scanner(System.in);
        int min, max;
        System.out.println("Enter the min");
        min = user_input.nextInt();
        System.out.println("Enter the max");
        max = user_input.nextInt();

        int random = (int)((Math.random() * (max-min+1)) + min);
        System.out.println(random);
    }
    public static void Task6(){
        Scanner user_input = new Scanner(System.in);
        //Simple Interest
        double principal, years, interestRate, amount;
        System.out.println("Enter the principal: ");
        principal = user_input.nextDouble();
        System.out.println("Enter the number of years: ");
        years = user_input.nextDouble();
        System.out.println("Enter the interest rate as  a decimal");
        interestRate = user_input.nextDouble();
        amount = principal * (1 + years * interestRate);
        System.out.print("The value after the term is: ");
        System.out.println(amount);

    }
    public static void Task7(){
        //Simple interest principal calculator
        Scanner user_input = new Scanner(System.in);
        double principal, years, interestRate, amount;
        System.out.println("Enter the desired amount: ");
        amount = user_input.nextDouble();
        System.out.println("Enter the number of years: ");
        years = user_input.nextDouble();
        System.out.println("Enter the interest rate as  a decimal");
        interestRate = user_input.nextDouble();
        principal = amount / (1 + years * interestRate);
        System.out.println("To earn " + amount + " in " + years + " years at " + (interestRate * 100) + "% you must invest an initial amount of: " + principal);
    }
    public static void Task8(){
        //Paycheck
        Scanner user_input = new Scanner(System.in);
        double totalPay, taxRate, retirement, finalPay;
        System.out.println("Enter total/gross Pay:");
        totalPay = user_input.nextDouble();
        System.out.println("Enter the tax rate: ");
        taxRate = user_input.nextDouble();
        System.out.println("Enter the 401k contribution: ");
        retirement = user_input.nextDouble();
        finalPay = (totalPay - (totalPay * taxRate)) - retirement;
        System.out.println("Your total pay: $" + totalPay + ", less a tax rate of " + (taxRate*100) + "%, less your 401k contribution of $" + retirement + " is: " + finalPay);
    }
    public static void Task9(){
        //Fun Bus
        Scanner user_input = new Scanner(System.in);
        int people, busesNeeded, peopleLeft;
        System.out.println("Enter the number of people needing a ride on the Fun Bus: ");
        people = user_input.nextInt();
        busesNeeded = people / 20;
        System.out.println(busesNeeded + " buses are needed.");
        peopleLeft = people % 20;
        System.out.println(peopleLeft + " need a ride home");
    }
    public static void Task10(){
        //Miles per Gallon calculator
        Scanner user_input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.###");

        double gasUsed, startNumber, endNumber;
        double milesPerGallon;

        System.out.print("Enter the gas used: ");
        gasUsed = user_input.nextDouble();
        System.out.print("Initial Odometer Reading: ");
        startNumber = user_input.nextDouble();
        System.out.print("Final Odometer Reading: ");
        endNumber = user_input.nextDouble();

        milesPerGallon = (endNumber - startNumber) / gasUsed;

        System.out.print("Miles per Gallon: " + decimalFormat.format(milesPerGallon));
    }
    public static void Task11(){
        int firstThree, secondThree = 0, lastFour;
        boolean loop = true;

        firstThree = ((int)(8 * Math.random()) * 100) + ((int)(8 * Math.random()) * 10)+ (int)(8 * Math.random());

        while(loop) {
            secondThree = ((int) (8 * Math.random()) * 100) + ((int) (10 * Math.random()) * 10) + (int) (10 * Math.random());
            if (secondThree <= 742) {
            loop = false;
            }
        }

        lastFour = ((int)(10 * Math.random()) * 1000) + ((int)(10 * Math.random()) * 100) + ((int)(10 * Math.random()) * 10) + (int)(10 * Math.random());

        System.out.println(firstThree + "-" + secondThree + "-" + lastFour);
    }

}
