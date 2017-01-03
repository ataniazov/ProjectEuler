package com.delta.euler;

/**
 * Created by delta on 1/3/17.
 * <p>
 * Number letter counts
 * Problem 17
 * <p>
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * <p>
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * <p>
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 */
public class NumberLetterCounts {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += getOneToThousandLetter(i);
        }
        System.out.println(sum);
        System.out.println(getOneToThousandLetter(88));
    }

    public static int getOneToThousandLetter(int number) {
        if (number > 1000 || number < 0) {
            return 0;
        } else {
            int sum = 0;

            String strNumber = String.valueOf(number);

            if (strNumber.length() == 4) {
                int thousandStep = Character.getNumericValue(strNumber.charAt(0));
                sum = letterCount(thousandStep) + letterCount(1000);
            } else if (strNumber.length() == 3) {
                int hundredStep = Character.getNumericValue(strNumber.charAt(0));
                int tenStep = Character.getNumericValue(strNumber.charAt(1));
                int oneStep = Character.getNumericValue(strNumber.charAt(2));

                sum += letterCount(hundredStep) + letterCount(100);

                if (oneStep != 0 || tenStep != 0) {
                    sum += 3; // and
                }

                if (tenStep == 0) {
                    sum += letterCount(oneStep);
                } else if (tenStep == 1) {
                    sum += letterCount(10 + oneStep);
                } else {
                    sum += letterCount(tenStep * 10) + letterCount(oneStep);
                }
            } else if (strNumber.length() == 2) {
                int tenStep = Character.getNumericValue(strNumber.charAt(0));
                int oneStep = Character.getNumericValue(strNumber.charAt(1));

                if (tenStep == 0) {
                    sum += letterCount(oneStep);
                } else if (tenStep == 1) {
                    sum += letterCount(10 + oneStep);
                } else {
                    sum += letterCount(tenStep * 10) + letterCount(oneStep);
                }

            } else {
                int oneStep = Character.getNumericValue(strNumber.charAt(0));
                sum = letterCount(oneStep);

            }

            return sum;
        }
    }

    public static int letterCount(int number) {
        switch (number) {
            case 1:
            case 2:
            case 6:
            case 10:
                return 3;
            case 4:
            case 5:
            case 9:
                return 4;
            case 3:
            case 7:
            case 8:
            case 40:
            case 50:
            case 60:
                return 5;
            case 11:
            case 12:
            case 20:
            case 30:
            case 80:
            case 90:
                return 6;
            case 15:
            case 16:
            case 70:
            case 100:
                return 7;
            case 13:
            case 14:
            case 18:
            case 19:
            case 1000:
                return 8;
            case 17:
                return 9;
            default:
                return 0;
        }
    }

}
