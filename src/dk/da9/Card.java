package dk.da9;

import java.util.*;

public class Card {
    private Suit suit;
    private Rank rank;

    public enum Suit {
        Spades(1),
        Hearts(2),
        Clubs(3),
        Diamonds(4);

        private int priority;

        Suit(int priority) {
            this.priority = priority;
        }

        public int getPriority() {
            return priority;
        }
    }

    public enum Rank {
        Ace(1),
        Two(2),
        Three(3),
        Four(4),
        Five(5),
        Six(6),
        Seven(7),
        Eight(8),
        Nine(9),
        Ten(10),
        Jack(11),
        Queen(12),
        King(13);


        private int priority;

        Rank(int priority) {
            this.priority = priority;
        }

        public int getPriority() {
            return priority;
        }
    }

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public static Card[] getShuffledDeck() {
        List<Card> deck = new ArrayList<>();

        //Spades
        for (int i = 0; i < 13; i++) {
            Card card = new Card(Suit.Spades, Rank.values()[i]);
            deck.add(card);
        }

        //Hearts
        for (int i = 0; i < 13; i++) {
            Card card = new Card(Suit.Hearts, Rank.values()[i]);
            deck.add(card);
        }

        //Clubs
        for (int i = 0; i < 13; i++) {
            Card card = new Card(Suit.Clubs, Rank.values()[i]);
            deck.add(card);
        }

        //Diamonds
        for (int i = 0; i < 13; i++) {
            Card card = new Card(Suit.Diamonds, Rank.values()[i]);
            deck.add(card);
        }

        Collections.shuffle(deck);

        Card[] cards = new Card[deck.size()];
        cards = deck.toArray(cards);

        return cards;
    }

    public static void bubbleSortDeck(Card[] deck) {
        int n = deck.length;
        Card temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                //If Card 1's suit is higher than Card 2's suit
                if (deck[j - 1].getSuit().getPriority() > deck[j].getSuit().getPriority()) {
                    //Flip the order of the two cards
                    temp = deck[j - 1];
                    deck[j - 1] = deck[j];
                    deck[j] = temp;
                }
                //If the suits are the same
                else if(deck[j-1].getSuit().getPriority() == deck[j].getSuit().getPriority()){
                    //If Card 1's rank is higher than Card 2's rank
                    if (deck[j - 1].getRank().getPriority() > deck[j].getRank().getPriority()) {
                        //Flip the order of the two cards
                        temp = deck[j - 1];
                        deck[j - 1] = deck[j];
                        deck[j] = temp;
                    }
                }
            }
        }
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", rank, suit);
    }
}

