package com.delta.euler;

/**
 * Created by delta on 12/27/16.
 * <p>
 * Largest prime factor
 * Problem 3
 * <p>
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

public class LargestPrimeFactor {
    public static void main(String[] args) {
        long bigNumber = 600851475143L;
        long division = 0;
        for(long i = 3; i < bigNumber; i+=2){
            if(isPrime(i) && bigNumber % i == 0){
                division = i;
                System.out.println(division);
            }
        }
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
