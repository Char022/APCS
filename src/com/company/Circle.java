package com.company;

public class Circle {
    private static final double PI = 3.14;
    private double radius;

    public Circle(int startRadius){
        radius = startRadius;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }

    public double area(){
        double circleArea;
        circleArea = PI * radius * radius;

        return circleArea;
    }

    public double getRadius(){
        return radius;
    }
    public double getCircumference(){
        return (radius * 2 * PI);
    }
    public static void displayArea(){
        System.out.println("The formula for area is PI * radius * radius");
    }
}
