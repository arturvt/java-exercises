package com.artur.java.exercises.basics;

import java.util.LinkedList;
import java.util.Queue;

/**
 * You have an unsorted array arr of non-negative integers and a number s. Find the longest contiguous subarray in arr that has a sum equal to s. Return two integers that represent its inclusive bounds. If there are several possible answers, return the one with the smallest left bound. If there are no answers, return [-1].
 * <p>
 * Your answer should be 1-based, meaning that the first position of the array is 1 instead of 0.
 */

public class FindLongestSubarrayBySum {
    /**
     * This solution uses a queue for keeping the track enabling the solution to have just one loop. With O(n) complexity.
     */
    static int[] solution(int s, int[] arr) {

        int[] response = new int[]{-1, -1};

        Queue<Integer> queue = new LinkedList<>();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            cnt += val;
            queue.add(val);

            if (cnt > s) {
                while (!queue.isEmpty() && cnt > s) {
                    int last = queue.poll();
                    cnt -= last;
                }
            }

            if (cnt == s) {
                int left = (i + 1) - (queue.size() - 1);
                int right = i + 1;
                int currentDiff = response[1] - response[0];
                int newDiff = right - left;
                if (newDiff > currentDiff || response[1] == -1) {
                    response = new int[]{left, right};
                }
            }

        }
        return response[0] == -1 ? new int[]{-1} : response;
    }


    static int[] bruteForceSolution(int s, int[] arr) {
        int cnt = 0;
        int leftIndex = -1;
        int rightIndex = -1;
        int[] response = new int[]{leftIndex, rightIndex};

        // Brute force, O(nLog(n))
        for (int x = 0; x < arr.length; x++) {
            for (int i = x; i < arr.length; i++) {
                int j = arr[i];
                if ((j + cnt) <= s) {
                    cnt += j;
                    leftIndex = leftIndex == -1 ? i : leftIndex;
                    rightIndex = rightIndex == -1 ? i : rightIndex + 1;
                } else { // If current number is bigger than S, we won't take this sub
                    leftIndex = -1;
                    rightIndex = -1;
                    cnt = 0;
                    break;
                }
                if (cnt == s) {
                    int currentDiff = response[1] - response[0];
                    int newDiff = rightIndex - leftIndex;
                    if (newDiff > currentDiff || response[1] == -1) {
                        response = new int[]{leftIndex + 1, rightIndex + 1};
                    }
                }
            }
        }

        return response[0] == -1 ? new int[]{-1} : response;
    }
}
