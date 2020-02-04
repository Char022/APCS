package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {



    public static void main(String[] args){
	//  write your code here
        powersOfTwo();
        Circle spot = new Circle(5);
        
        System.out.println("Circle radius: " + spot.getRadius());
        System.out.println("Circle area: " +spot.area());
        System.out.println("Circumference: " + spot.getCircumference());
        Circle.displayArea();
    }

    public static String questionNumberFour(String name, int number) {
        String output = "Welcome " + name + "! You are visitor number " + (number + 1) + ".";
        return output;
    }

    public static void powersOfTwo(){
        int x = 2;
        for(int i = 1; i <= 10; i++){
            System.out.println(x);
            x *= 2;
        }
    }
    }

