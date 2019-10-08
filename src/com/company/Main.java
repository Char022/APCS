package com.company;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class Main {
        
    public static void main(String[] args) {
	// write your code here
        //UnitTwoReview();
        UnitTwoReview();
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

    public static void UnitTwoReview(){
        Task6();
        Task7();
        Task8();
        Task5();
        Task9();
    }

}
