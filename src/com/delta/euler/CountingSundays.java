package com.delta.euler;

import java.time.DayOfWeek;
import java.time.Month;

/**
 * Created by delta on 1/7/17.
 * <p>
 * Counting Sundays
 * Problem 19
 * <p>
 * You are given the following information, but you may prefer to do some research for yourself.
 * <p>
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * <p>
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
public class CountingSundays {
    public static void main(String[] args) {
        int sundaySum = 0;
        int startYear = 1901;
        DayOfWeek yearStartWeekDay = DayOfWeek.TUESDAY;
        int endYear = 2000;

        SumAndWeekday temp;

        for (int i = startYear; i <= endYear; i++) {
            temp = sumOfSundaysInYear(i, yearStartWeekDay);
            sundaySum += temp.getDaySum();
            yearStartWeekDay = (temp.getWeekday());
        }
        System.out.println(sundaySum);
    }

    public static boolean isLeap(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        return false;
    }

    static class SumAndWeekday {
        private final int daySum;
        DayOfWeek weekday;

        public SumAndWeekday(int daySum, DayOfWeek weekday) {
            this.daySum = daySum;
            this.weekday = weekday;
        }

        public int getDaySum() {
            return daySum;
        }

        public DayOfWeek getWeekday() {
            return weekday;
        }
    }

    public static SumAndWeekday sumOfSundaysInYear(int year, DayOfWeek yearStartWeekDay) {
        int sundaySum = 0;
        int days = (isLeap(year)) ? 366 : 365;

        int february = (isLeap(year)) ? 29 : 28;

        int[] monthDays = {31, february, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int monthIndex = 0;
        int next = 1;

        for (int i = 1; i <= days; i++) {
            if (i == next) {
                next = i + monthDays[monthIndex++];
                if(yearStartWeekDay.equals(DayOfWeek.SUNDAY)){
                    sundaySum++;
                }
            }
            yearStartWeekDay = yearStartWeekDay.plus(1);
        }
        return new SumAndWeekday(sundaySum, yearStartWeekDay);
    }
}