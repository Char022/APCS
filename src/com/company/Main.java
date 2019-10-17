package com.company;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class Main {
        
    public static void main(String[] args) {
	// write your code here
    }

    public static void Task1(){
        int age = 15;
        System.out.println("my name is fill in the blank. i am " + age);
        int x = 7, y = 3;
        System.out.println("the sum of " + x + " and " + y + " is " + x + y);
        System.out.println("the difference of " + x + " and " + y + " is " + (x-y));
        System.out.println("the product of " + x + " and " + y + " is " + x * y);
        System.out.println("the quotient of " + x + " and " + y + " is " + x / y);
    }
    public static void Task2(){
        System.out.println ("To be or not to be, that is the question.");

    }
    public static void Task3(){
        Scanner user_input = new Scanner(System.in);
        int x, y, z;
        double a, b;
        System.out.println("enter 3 numbers");
        x=user_input.nextInt();
        y=user_input.nextInt();
        z=user_input.nextInt();

        System.out.println("The average of " + x +", " + y + ", " + z + " is " + ((int)(x+y+z)/3));

    }
    public static void Task4(){
        Scanner user_input = new Scanner(System.in);

        System.out.println("3 double averages");
        double input1 = user_input.nextDouble();
        double input2 = user_input.nextDouble();
        double input3 = user_input.nextDouble();
        //.2 3 4 5 6
        double output = (input1 + input2 + input3) / 3;
        System.out.println(output);

        System.out.println("2 float sum difference product");
        float thing1 = user_input.nextFloat();
        float thing2 = user_input.nextFloat();
        System.out.println((thing1+thing2));
        System.out.println((thing1-thing2));
        System.out.println((thing1*thing2));

        System.out.println("int temp");
        int fahrenheit = user_input.nextInt();
        System.out.println(((fahrenheit-32)*(5/9)));

        System.out.println("float miles");
        float miles = user_input.nextFloat();
        System.out.println((miles*1.60935));

        System.out.println("3 int hour minute second");
        int hours = user_input.nextInt();
        int minutes = user_input.nextInt();
        int seconds = user_input.nextInt();
        System.out.println(((hours*3600) + (minutes*60)+seconds));
    }


}
