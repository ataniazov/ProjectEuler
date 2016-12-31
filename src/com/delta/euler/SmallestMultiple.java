package com.delta.euler;

/**
 * Created by delta on 12/31/16.
 * <p>
 * Smallest multiple
 * Problem 5
 * <p>
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class SmallestMultiple {
    public static void main(String[] args) {
        outerloop:
        for (int i = 20; true; i += 10) {
            for (int j = 1; j <= 20; j++) {
                if (i % j != 0) {
                    break;
                } else if (j == 20) {
                    System.out.println("Tada: " + i);
                    break outerloop;
                }
            }
        }
    }
}
