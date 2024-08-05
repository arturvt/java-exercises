package com.artur.java.exercises.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindLongestSubarrayBySumTest {

    @Test
    void test_01() {
        int[] input = {1, 2, 3, 7, 5};
        int[] result01 = {2, 4};
        assertArrayEquals(result01, FindLongestSubarrayBySum.solution(12, input));
        assertArrayEquals(result01, FindLongestSubarrayBySum.bruteForceSolution(12, input));
        int[] result02 = {2, 3};
        assertArrayEquals(result02, FindLongestSubarrayBySum.solution(5, input));
        assertArrayEquals(result02, FindLongestSubarrayBySum.bruteForceSolution(5, input));
    }

    @Test
    void test_02() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = {1, 5};
        assertArrayEquals(result, FindLongestSubarrayBySum.solution(15, input));
        assertArrayEquals(result, FindLongestSubarrayBySum.bruteForceSolution(15, input));
    }

    @Test
    void test_03() {
        int[] input = {1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10};
        int[] result = {1, 8};
        assertArrayEquals(result, FindLongestSubarrayBySum.solution(15, input));
        assertArrayEquals(result, FindLongestSubarrayBySum.bruteForceSolution(15, input));
    }

    @Test
    void test_04() {
        int[] input = {3};
        int[] result = {1, 1};
        assertArrayEquals(result, FindLongestSubarrayBySum.solution(3, input));
        assertArrayEquals(result, FindLongestSubarrayBySum.bruteForceSolution(3, input));
    }


}