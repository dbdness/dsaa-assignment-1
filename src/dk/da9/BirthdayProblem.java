package dk.da9;

import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthdayProblem {

    public static void birthdayProblem() {
        System.out.println("==Birthday problem==");
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

        while (true) {
            random = StdRandom.uniform(0, n);
            if (!randoms.contains(random)) {
                randoms.add(random);
                System.out.println(count + ") " + random);
                count++;
            } else {
                System.out.println(count + ") " + random);
                System.out.println("Duplicate " + random + " found at try number " + count);
                return;
            }
        }
    }

    public static void birthdayProblemSimulated(List<Integer> nValues) {
        System.out.printf("%11s %18s %29s %13s\n",
                "N ",
                "Duplicate found at try number",
                "Number of expected tries",
                "Accuracy");
        for (int i = 0; i <= nValues.size() - 1; i++) {
            int n = nValues.get(i);
            int countBeforeDuplicate = birthdayLogicCount(n);
            int expectedTries = (int) Math.round(Math.sqrt(Math.PI * n * 2 / 2)); //The hypothesis states ~SQRT(PIE*N/2)
            double accuracy = (double) countBeforeDuplicate / (double) expectedTries; //The closer to 1.0, the better
            System.out.printf("%10d %15d %29d %25.1f\n",
                    n,
                    countBeforeDuplicate,
                    expectedTries,
                    accuracy);
        }

    }

    private static int birthdayLogicCount(int n) {
        List<Integer> randoms = new ArrayList<>();
        int random;
        int count = 1;

        while (true) {
            random = StdRandom.uniform(0, n);
            if (!randoms.contains(random)) {
                randoms.add(random);
                count++;
            } else {
                return count;
            }
        }

    }
}
