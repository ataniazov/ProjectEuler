package com.delta.euler;

/**
 * Created by delta on 1/4/17.
 * <p>
 * Special Pythagorean triplet
 * Problem 9
 * <p>
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * <p>
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        int circ = 1000;

        outerloop:
        for (a = 1; a < circ / 3; a++) {
            for (b = a; b < circ / 2; b++) {
                c = circ - a - b;
                if (a * a + b * b == c * c) {
                    break outerloop;
                }
            }
        }
        System.out.println(a * b * c);
    }
}
