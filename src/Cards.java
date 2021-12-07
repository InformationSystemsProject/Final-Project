public class Cards {
    private int rank; //card variable
    private int suit; //card variable
    final int numCards = 52;
    private static final String[] ranks = {"Ace", "King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two"};
    private static final String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

    //Creates cards (uses this keyword)
    Cards(int rank, int suit) {
       Cards[] deck = new Cards[numCards];
       int index = 0;
       for (suit = 0; suit <=3; suit++){
           for(rank =1; rank <= 13; rank++){
               deck[index] = new Cards(rank, suit);
               index++;
           }
       }
        for(int i = 0; i < deck.length; i++){
            System.out.println(deck[i]);

        }
    }
    /*
    //create deck using random
    public cardDeck(){
        deckofCards = new Cards[numCards];
    }*/
}
