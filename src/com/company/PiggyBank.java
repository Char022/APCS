package com.company;

public class PiggyBank {
    private double moneyInBank;

    public PiggyBank() {
        moneyInBank = 0;
    }

    public void addCoin(double cents) {
        moneyInBank += cents;
    }

    public double giveTotal(){
        return(moneyInBank);
    }

    public void removeCoins(double amount){
        if(moneyInBank >= amount){
            moneyInBank -= amount;
        }else{
            System.out.println("There isn't this much money in the bank");
        }
    }


}
