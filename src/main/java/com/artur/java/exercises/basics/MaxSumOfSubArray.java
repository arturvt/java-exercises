package com.artur.java.exercises.basics;

/**
 * From Code Signal: <a href="https://app.codesignal.com/interview-practice/question/dQD4TCunke2JQ98rj/description">...</a>
 * Given an array of integers, find the maximum possible sum you can get from one of its contiguous subarrays.<br>
 * The subarray from which this sum comes must contain at least 1 element.
 */
public class MaxSumOfSubArray {
    static int solutionOptimized(int[] intPutArray) {
        int max_sum = intPutArray[0];
        int current_sum = max_sum;

        for(int i = 1; i < intPutArray.length; i++) {
            current_sum = Math.max(intPutArray[i] + current_sum, intPutArray[i]);
            max_sum = Math.max(max_sum, current_sum);
        }
        return max_sum;
    }

    static int solutionBruteForce(int[] inputArray) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum;
        // brute force
        for(int i = 0; i < inputArray.length -1; i++ ) {
            current_sum = inputArray[i];
            if (current_sum > max_sum) {
                max_sum = current_sum;
            }
            for(int x = i + 1; x < inputArray.length; x ++) {
                current_sum +=inputArray[x];
                if (current_sum > max_sum) {
                    max_sum = current_sum;
                }
            }
        }

        return max_sum;
    }

}
