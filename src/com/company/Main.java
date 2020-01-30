package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {



    public static void main(String[] args){
	// write your code here
        Circle spot = new Circle();

        spot.setRadius(5);

        System.out.println("Circle radius: " + spot.getRadius());
        System.out.println("Circle area: " +spot.area());
        System.out.println("Circumference: " + spot.getCircumference());
    }
}

