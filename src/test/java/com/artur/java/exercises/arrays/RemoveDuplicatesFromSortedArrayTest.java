package com.artur.java.exercises.arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray underTest = new RemoveDuplicatesFromSortedArray();


    @Test
    void test_01() {
        int[] val = {1,1,1,2,2,3};
//        Output: 5, nums = [1,1,2,2,3,_]
        assertEquals(5, underTest.removeDuplicates(val));
    }

    @Test
    void test_02() {
        int[] val = {0,0,1,1,1,1,2,3,3};
//        Output: 5, nums = [0,0,1,1,2,3,3,_,_]
        assertEquals(7, underTest.removeDuplicates(val));
    }

    @Test
    void test_03() {
        int[] val = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
//        Output: 3, nums = [0,0,1,_]
        assertEquals(3, underTest.removeDuplicates(val));
    }

    @Test
    void test_04() {
        int[] val = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1};
//        Output: 5, nums = [0,0,1,1,2,3,3,_,_]
        assertEquals(4, underTest.removeDuplicates(val));
    }

}