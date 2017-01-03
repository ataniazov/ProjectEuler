package com.delta.euler;

import java.math.BigDecimal;

/**
 * Created by delta on 1/3/17.
 * <p>
 * Power digit sum
 * Problem 16
 * <p>
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * <p>
 * What is the sum of the digits of the number 2^1000?
 */
public class PowerDigitSum {
    public static void main(String[] args) {
       BigDecimal bigBoy = new BigDecimal(2).pow(1000);
       String bigStr = bigBoy.toString();

       long sum = 0;
       for(int i = 0; i < bigStr.length(); i++){
           sum += Character.getNumericValue(bigStr.charAt(i));
       }
        System.out.println(sum);
    }

}
