package com.company;

import java.util.Scanner;

public class Main {
        
    public static void main(String[] args) {
	// write your code here
        awards();
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
        
    }

}
