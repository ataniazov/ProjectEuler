package com.delta.euler;

/**
 * Created by delta on 12/31/16.
 * <p>
 * Sum square difference
 * Problem 6
 * <p>
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 * <p>
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * <p>
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * <p>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class SumSquareDifference {
    public static void main(String[] args) {
        long sumOfTheSquares = 0;
        long squareOfTheSum = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfTheSquares += Math.pow(i, 2);
            squareOfTheSum += i;
        }
        System.out.println((long) Math.pow(squareOfTheSum, 2) - sumOfTheSquares);
    }
}
