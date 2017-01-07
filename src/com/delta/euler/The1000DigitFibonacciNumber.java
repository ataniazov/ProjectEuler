package com.delta.euler;

import java.math.BigDecimal;

/**
 * Created by delta on 1/6/17.
 * <p>
 * 1000-digit Fibonacci number
 * Problem 25
 * <p>
 * The Fibonacci sequence is defined by the recurrence relation:
 * <p>
 * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 * <p>
 * Hence the first 12 terms will be:
 * <p>
 * F1 = 1
 * F2 = 1
 * F3 = 2
 * F4 = 3
 * F5 = 5
 * F6 = 8
 * F7 = 13
 * F8 = 21
 * F9 = 34
 * F10 = 55
 * F11 = 89
 * F12 = 144
 * <p>
 * The 12th term, F12, is the first term to contain three digits.
 * <p>
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
public class The1000DigitFibonacciNumber {
    public static void main(String[] args) {
        BigDecimal Frst = new BigDecimal(1);
        BigDecimal Scnd = new BigDecimal(1);
        long i;
        for (i = 2; Scnd.precision() < 1000; i++) {
            BigDecimal Temp = Frst;
            Frst = Scnd;
            Scnd = Temp;
            Scnd = Scnd.add(Frst);
        }
//        System.out.println(Scnd);
        System.out.println(i);
    }
}
