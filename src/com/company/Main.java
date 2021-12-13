package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //state our purpose
        System.out.println("Welcome to Slightly Better Than Average Casino");
        System.out.println("You will be playing Blackjack today! GET READY!");
        System.out.println("Are you ready to play?: ");
        String playerDecision = input.next();

        //bets are made
        System.out.println("Ok! How much do you want to bet? $ ");
        int betted = input.nextInt();
        // dealer is dealt cards
        //player is dealt cards
        //player takes their turn
        //dealer takes their turn
        //end game somehow here
        //show player's account balance
    }
}



