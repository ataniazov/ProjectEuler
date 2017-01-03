package com.delta.euler;

/**
 * Created by delta on 1/3/17.
 * <p>
 * Longest Collatz sequence
 * Problem 14
 * <p>
 * The following iterative sequence is defined for the set of positive integers:
 * <p>
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * <p>
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * <p>
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * <p>
 * Which starting number, under one million, produces the longest chain?
 * <p>
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class LongestCollatzSequence {

    public static void main(String[] args) {
        int product = 0;
        long number = 0;

        for (long i = 999999; i > 99999; i--) {
            int temp = collatz(i);
            if (temp > product) {
                number = i;
                product = temp;
            }
        }
        System.out.println(number + " : " + product);
    }

    public static int collatz(long num) {
        if (num != 1) {
            if (num % 2 == 0) {
                return 1 + collatz(num / 2);
            } else {
                return 1 + collatz(3 * num + 1);
            }
        }
        return 1;
    }
}
