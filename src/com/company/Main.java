package com.company;

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
}

