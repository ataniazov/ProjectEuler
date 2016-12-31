package com.delta.euler;

//import java.util.Scanner;

/**
 * Created by delta on 12/27/16.
 */

public class MultiplesOf3And5 {
    public static void main(String[] args) {
        // write your code here
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter 1. devision number: ");
//        int devide1 = input.nextInt();
//        System.out.println("Enter 2. devision number: ");
//        int devide2 = input.nextInt();
//
//        System.out.println("Enter end number: ");
//        int end = input.nextInt();

//        System.out.println(end);
        int sum = 0;
        for (int i = 2; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
