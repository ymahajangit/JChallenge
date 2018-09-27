/*
  Count highest number of repeated chars in a string.
  For example aabbbcccddddd returns 2d
 */
package jchallenge;

import java.util.Scanner;

/**
 * @author Yogesh Mahajan
 */
public class CharCount {

    /**
     * @param args default args
     */
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        String input;

        while ((input = inputScanner.nextLine()) != null)
            System.out.println("Answer: " + charCount(input));

        inputScanner.close();
    }

    private static String charCount(String input) {
        String answer;

        int maxCount = 1;
        char maxCharRepeated = input.charAt(0);

        int count = 1;

        for (int i = 1; i < input.length(); i++) {

            char currentChar = input.charAt(i);
            if (currentChar == input.charAt(i - 1)) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    maxCharRepeated = currentChar;
                }
            } else {
                count = 1;
            }
        }

        answer = "" + maxCount + maxCharRepeated;

         return answer;
    }


}
