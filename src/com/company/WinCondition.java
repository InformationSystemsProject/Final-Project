package com.company;

public class WinCondition {
    public void playerSituation(int playerTotal){
        boolean bust = false;
        if (playerTotal > 21){
            System.out.println("Sorry to be the bearer of bad news, but you busted buster");
        }
        else if (playerTotal == 21){
            System.out.println("You reached 21, you win!");
        }

    }
    public void dealerSituation(int dealerTotal){
        if (dealerTotal > 21){
            System.out.println("Automatic win for player: Dealer busted!");
        }
        else if (dealerTotal == 21){
            System.out.println("The dealer reached 21, they won!");
        }

    }
}
