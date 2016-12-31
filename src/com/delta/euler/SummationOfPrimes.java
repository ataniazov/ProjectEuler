package com.delta.euler;

/**
 * Created by delta on 12/31/16.
 * <p>
 * Summation of primes
 * Problem 10
 * <p>
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * <p>
 * Find the sum of all the primes below two million.
 */
public class SummationOfPrimes {
    public static void main(String[] args) {
        long sumOfPrimes = 2;
        for (int i = 3; i <= 2000000; i += 2) {
            if (isPrime(i)) {
                sumOfPrimes += i;
            }
        }
        System.out.println(sumOfPrimes);
    }

    public static boolean isPrime(long number) {
        if (number == 0 || number == 1) {
            return false;
        } else if (number == 2 || number == 3 || number == 5 || number == 7) {
            return true;
        } else if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
            return false;
        } else {
            for (long i = 9; i < Math.sqrt(number) + 1; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
