package com.delta.euler;

/**
 * Created by delta on 12/31/16.
 * <p>
 * Largest palindrome product
 * Problem 4
 * <p>
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int largestPalindrome = 0;
        int ThreeDigitNumbers = 999;

        outerloop:
        for (int i = ThreeDigitNumbers; i >= ThreeDigitNumbers - 100; i--) {
            largestPalindrome = Integer.parseInt(String.valueOf(i) + (new StringBuilder(String.valueOf(i)).reverse().toString()));
            for (int j = 999; j >= i; j--) {
                if (largestPalindrome % j == 0 && (largestPalindrome / j) < 1000) {
                    break outerloop;
                }
            }
        }
        System.out.println(largestPalindrome);
    }
}
