package lv.lu.training.lesson7;

import java.util.Random;

public class ShufflingCardDeck {

    public static final String[] SUIT_ARR = {"s", "h", "d", "c"};
    public static final String[] VALUE_ARR = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public static void main(String[] args) {
        String[] deck = createDeck();
        print(deck);
        shuffle(deck);
        print(deck);
    }

    public static void shuffle(String[] deck) {
        Random random = new Random();
        int shuffleCount = 1000;

        while (shuffleCount > 0) {
            int random1 = generateNumber(deck, random);
            int random2 = generateNumber(deck, random);


           String card1 = deck[random1];
           String card2 = deck[random2];

           deck[random1] = card2;
           deck[random2] = card1;
           shuffleCount--;
        }
    }

    public static int generateNumber(String[] deck, Random random) {
        return random.ints(0, deck.length -1).findFirst().getAsInt();
    }

    private static String[] createDeck() {
        String[] deck = new String[SUIT_ARR.length * VALUE_ARR.length ];
        int deckCounter = 0;
        for (String suit : SUIT_ARR) {
            for (String value : VALUE_ARR) {
                deck[deckCounter++] = suit + value;
            }
        }
        return deck;
    }

    public static void print(String[] deck) {

        for (int i = 0; i < deck.length; i++) {
            if (isNextSuit(i)) {
                System.out.println();
            } else {
                System.out.println(" " + deck[i] + " ");
            }
        }
        System.out.println();
    }

    public static boolean isNextSuit(int i) {
        return i % 13 == 0;
    }
}
