package com.company;

import java.util.Random;

public class Deck  {
    Random random = new Random();

    //array of all the possible cards in a deck
    private String[] deck = {"Ace of Spades", "Ace of Diamonds", "Ace of Ace of Hearts", "Ace of Clubs",
            "Two of Diamonds", "Two of Hearts", "Two of Clubs", "Two of Spades",
            "Three of Diamonds", "Three of Hearts", "Three of Clubs", "Three of Spades",
            "Four of Diamonds", "Four of Hearts", "Four of Clubs", "Four of Spades",
            "Five of Diamonds", "Five of Hearts", "Five of Clubs", "Five of Spades",
            "Six of Diamonds", "Six of Hearts", "Six of Clubs", "Six of Spades",
            "Seven of Diamonds", "Seven of Hearts", "Seven of Clubs", "Seven of Spades",
            "Eight of Diamonds", "Eight of Hearts", "Eight of Clubs", "Eight of Spades",
            "Nine of Diamonds", "Nine of Hearts", "Nine of Clubs", "One of Spades",
            "Ten of Diamonds", "Ten of Hearts", "Ten of Clubs", "One of Spades",
            "Jack of Diamonds", "Jack of Hearts", "Jack of Clubs", "One of Spades",
            "Queen of Diamonds", "Queen of Hearts", "Queen of Clubs", "Queen of Spades",
            "King of Diamonds", "King of Hearts", "King of Clubs", "King of Spades"
    };

    //values of the cards
    public int compareCard(String card) {
        String mycard = card;
        //initial value
        int cardValue = 0;
        if(mycard == "Ace of Spades" || mycard == "Ace of Diamonds" || mycard == "Ace of Hearts" || mycard == "Ace of Clubs") cardValue = 1;
        else if(mycard == "Two of Spades" || mycard == "Two of Diamonds" || mycard == "Two of Hearts" || mycard == "Two of Clubs") cardValue = 2;
        else if(mycard == "Three of Spades" || mycard == "Three of Diamonds" || mycard == "Three of Hearts" || mycard == "Three of Clubs") cardValue = 3;
        else if(mycard == "Four of Spades" || mycard == "Four of Diamonds" || mycard == "Four of Hearts" || mycard == "Four of Clubs") cardValue = 4;
        else if(mycard == "Five of Spades" || mycard == "Five of Diamonds" || mycard == "Five of Hearts" || mycard == "Five of Clubs") cardValue = 5;
        else if(mycard == "Six of Spades" || mycard == "Six of Diamonds" || mycard == "Six of Hearts" || mycard == "Six of Clubs") cardValue = 6;
        else if(mycard == "Seven of Spades" || mycard == "Seven of Diamonds" || mycard == "Seven of Hearts" || mycard == "Seven of Clubs") cardValue = 7;
        else if(mycard == "Eight of Spades" || mycard == "Eight of Diamonds" || mycard == "Eight of Hearts" || mycard == "Eight of Clubs") cardValue = 8;
        else if(mycard == "Nine of Spades" || mycard == "Nine of Diamonds" || mycard == "Nine of Hearts" || mycard == "Nine of Clubs") cardValue = 9;
        else if(mycard == "Ten of Spades"|| mycard == "Ten of Diamonds"|| mycard == "Ten of Hearts"|| mycard == "Ten of Clubs") cardValue = 10;
        else if(mycard == "Jack of Spades" || mycard == "Jack of Diamonds" || mycard == "Jack of Hearts" || mycard == "Jack of Clubs") cardValue = 10;
        else if(mycard == "Queen of Spades" || mycard == "Queen of Diamonds" || mycard == "Queen of Hearts" || mycard == "Queen of Clubs") cardValue = 10;
        else if(mycard == "King of Spades" || mycard == "King of Diamonds" || mycard == "King of Hearts" || mycard == "King of Clubs") cardValue = 10;

        return cardValue;
    }

    public String dealCard(){
        return deck[random.nextInt(deck.length)];
    }
}
