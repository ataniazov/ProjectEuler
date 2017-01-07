package com.delta.euler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by delta on 1/4/17.
 * <p>
 * Names scores
 * Problem 22
 * <p>
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
 * <p>
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
 * <p>
 * What is the total of all the name scores in the file?
 */
public class NamesScores {
    public static void main(String[] args) {
        String fileSplitBy = ",";

        String[] namesArry;

        try (BufferedReader br = new BufferedReader(new FileReader("/home/delta/IdeaProjects/ProjectEuler/src/com/delta/euler/resources/p022_names.txt"))) {

            namesArry = br.readLine().split(fileSplitBy);
            Arrays.sort(namesArry);

            long sum = 0;
            for (int i = 0; i < namesArry.length; i++) {
                sum += (getNameValue(namesArry[i].replace("\"", "")) * (i + 1));
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getNameValue(String name) {
        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            sum += Character.getNumericValue(name.charAt(i)) - Character.getNumericValue('A') + 1;
        }
        return sum;
    }
}
