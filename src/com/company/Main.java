package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args){
	// write your code here

    }




    public static void countDown(int maxNumber){
        if(maxNumber < 1){
            System.out.println("Error");
        }else{
            for(int i = 0; i < maxNumber; i++){
                System.out.println((maxNumber - i) + "...");
            }
        System.out.println("Blast off!!");
        }
    }

    public static int test1(int min, int max){
        Random random = new Random();
        int randomNum = random.nextInt(max - min + 1)+min;
        System.out.println("The random number between " + min + " and " + max + " is: " + randomNum);
        return randomNum;
    }



}

