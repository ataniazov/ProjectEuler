package com.delta.euler;

/**
 * Created by delta on 12/27/16.
 */
public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        int frst = 1;
        int scnd = 2;
        long sum = 0;
       while(frst < 4000000){
           if(frst % 2 == 0){
               sum += frst;
           }
//           System.out.print(frst + ":" + sum + " ");
           frst ^= scnd;
           scnd ^= frst;
           frst ^= scnd;
           scnd += frst;
       }
        System.out.println(sum);
    }
}
