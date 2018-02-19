package dk.da9;

import edu.princeton.cs.algs4.Shell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    private static final int MIN_VALUE = 2;
    private static final int MAX_VALUE = 2000000;

    public static void main(String[] args) {
        //BirthdayProblem.birthdayProblem();

        //CouponCollectorProblem.couponCollectorProblem();

        List<Integer> nValues = new ArrayList<>();
        for (int n = MIN_VALUE; n < MAX_VALUE; n *= 2) {
            nValues.add(n);
        }

        //BirthdayProblem.birthdayProblemSimulated(nValues);

        //CouponCollectorProblem.couponCollectorSimulated(nValues);

        /*
        List<Card> deck = new ArrayList<>();
        deck.add(new Card(Card.Suit.Hearts, Card.Rank.Two));
        deck.add(new Card(Card.Suit.Spades, Card.Rank.Ace));
        deck.add(new Card(Card.Suit.Clubs, Card.Rank.Ten));
        deck.add(new Card(Card.Suit.Spades, Card.Rank.Two));
        */

        //Comparable[] cards = new Comparable[deck.size()-1];
        Card[] cards = new Card[4];

        cards[0] = new Card(Card.Suit.Hearts, Card.Rank.Two);
        cards[1] = new Card(Card.Suit.Spades, Card.Rank.Ace);
        cards[2] = new Card(Card.Suit.Clubs, Card.Rank.Ten);
        cards[3] = new Card(Card.Suit.Spades, Card.Rank.Two);


        for(Card card : cards){
            System.out.println(card);
        }


    }


}
