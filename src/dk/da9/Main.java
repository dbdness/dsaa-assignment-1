package dk.da9;

import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final int MIN_VALUE = 2;
    private static final int MAX_VALUE = 2000000;

    public static void main(String[] args) {
        //System.out.println("==Birthday problem==");
        //BirthdayProblem.birthdayProblem();

        //System.out.println("==Coupon collector problem==");
        //CouponCollectorProblem.couponCollectorProblem();

        List<Integer> nValues = new ArrayList<>();
        for(int n=MIN_VALUE; n<MAX_VALUE; n*=2){
            nValues.add(n);
        }

        //System.out.println("==Birthday problem *SIMULATED*==");
        //BirthdayProblem.birthdayProblemSimulated(nValues);

        System.out.println("==Coupon collector problem *SIMULATED*==");
        CouponCollectorProblem.couponCollectorSimulated(nValues);

    }


}
