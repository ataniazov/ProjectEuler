package com.delta.euler;

import java.math.BigDecimal;

/**
 * Created by delta on 1/3/17.
 * <p>
 * Factorial digit sum
 * Problem 20
 * <p>
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * <p>
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * <p>
 * Find the sum of the digits in the number 100!
 */
public class FactorialDigitSum {
    public static void main(String[] args) {
        BigDecimal bigBoy = new BigDecimal(1);
        for(int i = 1; i <= 100; i++){
            bigBoy = bigBoy.multiply(new BigDecimal(i));
        }

        String bigStr = bigBoy.toString();
//        System.out.println(bigStr);

        long sum = 0;
        for(int i = 0; i < bigStr.length(); i++){
            sum += Character.getNumericValue(bigStr.charAt(i));
        }

        System.out.println(sum);
    }
}
