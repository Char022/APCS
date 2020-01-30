package com.company;

public class Circle {
    private double radius;

    public Circle(){
        radius = 1;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }

    public double area(){
        double circleArea;
        circleArea = Math.PI * radius * radius;

        return circleArea;
    }

    public double getRadius(){
        return radius;
    }
    public double getCircumference(){
        return (radius * 2 * Math.PI);
    }
    public static void displayArea(){
        System.out.println("The formula for area is PI * radius * radius");
    }
}
