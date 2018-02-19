package dk.da9;

import edu.princeton.cs.algs4.StdRandom;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CouponCollectorProblem {

    private static final double EULER_MASCHERONI_CONST = 0.57722;

    public static void couponCollectorProblem() {
        System.out.println("==Coupon collector problem==");
        System.out.println("Input integer N:");
        Scanner input = new Scanner(System.in);
        int count = 0;
        int n = 0;
        try {
            n = input.nextInt();
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }

        //A HashSet only allows unique values. If the same item is added again, the HashSet will simply ignore it.
        Set<Integer> randoms = new HashSet<>();

        while (true) {
            //We simply try to store every random number. The HashSet automatically ignores it if it's already stored.
            int random = StdRandom.uniform(0, n);
            randoms.add(random);
            System.out.println(count + ") " + random);
            count++;

            //When the collection contains every unique number from 0 to N, we break the loop.
            if (randoms.size() == n) {
                int lastCount = count - 1;
                System.out.println("All possible values have now been found at try number " + lastCount + ".");
                return;
            }
        }
    }

    public static void couponCollectorSimulated(List<Integer> nValues) {
        System.out.println("==Coupon collector problem *SIMULATED*==");
        System.out.printf("%11s %19s %28s %14s\n",
                "N ",
                "Amount of numbers before all values",
                "Number of expected tries",
                "Accuracy");
        for (int i = 0; i <= nValues.size() - 1; i++) {
            int n = nValues.get(i);
            int numberOfTries = couponCollectorLogicCount(n);
            int expectedTries = (int) Math.round(n * getHarmonicNumber(n)); //The hypothesis states ~NHn
            double accuracy = (double) numberOfTries / (double) expectedTries; //The closer to 1.0, the better
            System.out.printf("%10d %16d %35d %25.1f\n",
                    n,
                    numberOfTries,
                    expectedTries,
                    accuracy);
        }
    }

    //The harmonic number grows approximately as (the Euler–Mascheroni constant + log n).
    private static double getHarmonicNumber(int n) {
        return EULER_MASCHERONI_CONST + Math.log(n);
    }

    private static int couponCollectorLogicCount(int n) {
        Set<Integer> randoms = new HashSet<>();

        int count = 0;

        while (true) {
            int random = StdRandom.uniform(0, n);
            randoms.add(random);
            count++;

            if (randoms.size() == n) return count - 1;
        }


    }
}
