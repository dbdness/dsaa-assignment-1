package dk.da9;

import edu.princeton.cs.algs4.StdRandom;

import java.util.*;

public class CouponCollectorProblem {

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

    private static void couponCollectorLogicCount(){
        

    }
}
