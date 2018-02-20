package dk.da9;

import java.util.ArrayList;
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

        Card[] deck = Card.getShuffledDeck();
        System.out.println("Before sort:");
        for (Card card : deck) {
            System.out.println(card);
        }

        Card.bubbleSortDeck(deck);

        System.out.println("\n\nAfter sort:");
        for (Card card : deck) {
            System.out.println(card);
        }


    }




}
