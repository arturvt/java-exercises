package com.artur.java.exercises.basics;

public class BasicCases {
    /**
     * It returns the sum of the numbers given.
     * For example: number 29. The sum is 11
     * @param number
     * @return
     */
    static int sumDigits(int number) {
        String asString = String.valueOf(number);
        char[] numbers = asString.toCharArray();
        int sum = 0;
        for(char charNumber:numbers) {
            sum+= charNumber - '0';
        }
        return sum;
    }

    /**
     * If 2, returns 99
     * @param n - number of digits
     * @return largest number from a given n.
     */
    static int returnsLargestNumberWithNDigits(int n) {
        return Integer.parseInt("9".repeat(Math.max(0, n)));
    }

}
