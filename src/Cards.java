public class Cards {
    private int rank;
    private int suit;
    private static String[] ranks = {"Ace", "King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two"};
    private static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

    //Creates cards
    Cards(int suit, int rank) {
        this.suit=suit;
        this.rank=rank;
    }
}
