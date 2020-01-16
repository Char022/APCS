package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void fahrenheitToCelsius(){
        double fTemp, cTemp;
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.#");

        System.out.print("Enter a Fahrenheit temperature: ");
        fTemp = input.nextDouble();

        cTemp = (double)5/(double)9*(fTemp-32);
        System.out.println("The Celsius temperature is: " + decimal.format(cTemp) + " degrees.");
//yeet
    }

    public static void celsiusToFahrenheit(){
        double fTemp, cTemp;
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.#");

        System.out.print("Enter a Celsius temperature: ");
        cTemp = input.nextDouble();

        fTemp = (double)9/(double)5*cTemp + 32;
        System.out.println("The Fahrenheit temperature is: " + decimal.format(fTemp) + " degrees.");

    }

    public static void main(String[] args) throws InterruptedException{
	// write your code here
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("1. Fahrenheit to Celsius conversion. ");
        System.out.println("2. Celsius to Fahrenheit conversion. ");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();

        if(choice == 1){
            fahrenheitToCelsius();
        }else{
            celsiusToFahrenheit();
        }

    }
}

