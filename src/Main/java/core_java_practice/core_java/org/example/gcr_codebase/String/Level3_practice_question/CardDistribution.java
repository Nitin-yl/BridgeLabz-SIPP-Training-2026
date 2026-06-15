package Main.java.core_java_practice.core_java.org.example.gcr_codebase.String.Level3_practice_question;

import java.util.Scanner;

public class CardDistribution {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {

        if (players * cardsPerPlayer > deck.length) {
            return null;
        }

        String[][] playerCards = new String[players][cardsPerPlayer];

        int cardIndex = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex++];
            }
        }

        return playerCards;
    }

    public static void printPlayers(String[][] playerCards) {

        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + ":");

            for (int j = 0; j < playerCards[i].length; j++) {
                System.out.println(playerCards[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        String[] deck = initializeDeck();

        shuffleDeck(deck);

        String[][] playerCards =
                distributeCards(deck, players, cardsPerPlayer);

        if (playerCards == null) {
            System.out.println("Cannot distribute cards. Not enough cards in the deck.");
        } else {
            printPlayers(playerCards);
        }

        sc.close();
    }
}
