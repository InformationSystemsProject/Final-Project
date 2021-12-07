public class Cards {
    private int rank; //card variable
    private int suit; //card variable
    private static String[] ranks = {"Ace", "King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two"};
    private static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

    //Creates cards
    Cards(int suit, int rank) {
        this.suit=suit;
        this.rank=rank;
    }
}
