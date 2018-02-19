package dk.da9;

import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CouponCollectorProblem {

    public static void couponCollectorProblem() {
        System.out.println("==Coupon collector problem==");
        System.out.println("Input integer N:");
        Scanner input = new Scanner(System.in);
        int n = 0;
        try {
            n = input.nextInt();
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }

        List<Integer> randoms = new ArrayList<>();
        int count = 1;
        int random = 0;

        List<Integer> range = new ArrayList<>();
        for (int i = 0; i <= n - 1; i++) {
            range.add(i);
        }

        while (true) {
            random = StdRandom.uniform(0, n);
            if (!randoms.containsAll(range)) {
                randoms.add(random);
                System.out.println(count + ") " + random);
                //System.out.println(random);
                count++;
            } else {
                int lastCount = count - 1;
                System.out.println("All possible values have now been found at try number " + lastCount);
                return;
            }
        }
    }
}
