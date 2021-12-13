package com.company;

public class Player extends Deck {
    //starting amount for player
    private int balance = 1000;
    //used to keep track of betted amounts
    private int betted = 0;
    int[] h;

    //total value of player's hand
    int playerTotal = 0;

    //options for the player
    public void hit(){
        dealCard();
        compareCard();

    }
    public void showBalance(){
        System.out.println("Your current balance is: " + balance);
    }
}
