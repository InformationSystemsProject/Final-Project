package com.company;

import java.util.Scanner;

public class Blackjack extends WinCondition {
    public void play(){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        //state our purpose
        System.out.println("Welcome to Slightly Better Than Average Casino");
        System.out.println("You will be playing Blackjack today! GET READY!");
        System.out.println("Are you ready to play? Type yes or no: ");
        String playerDecision = input.next();
        if (playerDecision == "yes") {
            //bets are made
            System.out.println("Ok! How much do you want to bet? $ ");
            int betted = input.nextInt();
            //Asks for players name
            System.out.println("ok! What is your name?: ");
            String playerName = input2.nextLine();
            //dealer is dealt cards
            dealTwoCards;
            //will need to create something to store cards value to something
            //player is dealt cards
            System.out.println("Ok " + playerName+ " here are your cards");
            dealTwoCards;
            playerTotal;//will need to add card values to player total
            //player takes their turn
            System.out.println("Do you hit or stand?");
            String stance = input3.nextLine();
            if (stance == "hit"){
                hit;
                playerTotal;//will need to add card values to player total
            }else{//dealer takes their turn and adds card value to their total
                dealCard;
            }
            //Goes into WinCondition
            //show player's account balance
            showBalance;
        }else {
                System.out.println("Ok. Come back when you are ready!");
        }
    }

}
