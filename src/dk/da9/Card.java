package dk.da9;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Card implements Comparable<Card> {
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
    }

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public int compareTo(Card other) {
        int i = Integer.compare(this.suit.priority, other.rank.priority);
        if(i != 0) return i;

        i = Integer.compare(this.rank.priority, other.rank.priority);

        return i;

    }

    public static List<Card> getShuffledDeck(){
        List<Card> deck = new ArrayList<>();

        //Spades
        for(int i=0; i<13; i++){
            Card card = new Card(Suit.Spades, Rank.values()[i]);
            deck.add(card);
        }

        //Hearts
        for(int i=0; i<13; i++){
            Card card = new Card(Suit.Hearts, Rank.values()[i]);
            deck.add(card);
        }

        //Clubs
        for(int i=0; i<13; i++){
            Card card = new Card(Suit.Clubs, Rank.values()[i]);
            deck.add(card);
        }

        //Diamonds
        for(int i=0; i<13; i++){
            Card card = new Card(Suit.Diamonds, Rank.values()[i]);
            deck.add(card);
        }

        Collections.shuffle(deck);

        return deck;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", rank, suit);
    }
}

