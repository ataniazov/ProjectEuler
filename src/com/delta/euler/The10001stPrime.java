package com.delta.euler;

/**
 * Created by delta on 12/31/16.
 * <p>
 * 10001st prime
 * Problem 7
 * <p>
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p>
 * What is the 10 001st prime number?
 */
public class The10001stPrime {
    public static void main(String[] args) {
        int limit = 10001;
        int counter = 0;
        int i;

        for (i = 2; counter < limit; i++) {
            if (isPrime(i)) {
                counter++;
                if (counter == limit) {
                    break;
                }
            }
            if (i != 2) {
                i++;
            }
        }
        System.out.println(i);
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
