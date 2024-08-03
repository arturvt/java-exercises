package com.artur.java.exercises.arrays;

/**
 * From <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int duplicates = 0;
        int minNumber = nums[0] - 1;
        for(int i = 0; i < nums.length-2; i++) {
            int first = nums[i];
            int second = nums[i+1];
            int third = nums[i+2];

            if (first == second && second == third) {
                i = i+2;
                for(; i < nums.length-1; i++) {
                    if(nums[i] == first) {
                        duplicates++;
                        nums[i] = minNumber;
                    } else {
                        break;
                    }
                }

            }
        }
        return nums.length - duplicates;
    }


}
