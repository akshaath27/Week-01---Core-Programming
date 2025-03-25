import java.util.Random;
public class Level3q10 {
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        return deck;
    }
    public static String[] shuffleDeck(String[] deck) {
        Random random = new Random();
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + random.nextInt(n - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }
    public static String[][] distributeCards(String[] deck, int numPlayers) {
        int n = deck.length;
        if (n % numPlayers != 0) {
            System.out.println("Cannot distribute cards evenly among players.");
            return null;
        }
        int cardsPerPlayer = n / numPlayers;
        String[][] players = new String[numPlayers][cardsPerPlayer];
        int deckIndex = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[deckIndex++];
            }
        }
        return players;
    }
    public static void printPlayersAndCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String[] deck = initializeDeck();
        System.out.println("Initial Deck:");
        for (String card : deck) {
            System.out.println(card);
        }
        System.out.println();
        deck = shuffleDeck(deck);
        System.out.println("Shuffled Deck:");
        for (String card : deck) {
            System.out.println(card);
        }
        System.out.println();
        int numPlayers = 4; 
        String[][] players = distributeCards(deck, numPlayers);
        if (players != null) {
            printPlayersAndCards(players);
        }
    }
}
