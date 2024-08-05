package com.artur.java.exercises.basics;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumDigitsTest {

    @Test
    void test_basic() {
      assertEquals(11, BasicCases.sumDigits(29));
      assertEquals(2, BasicCases.sumDigits(11));
    }

    @Test
    void test_largestNumberWithNDigits() {
        assertEquals(99, BasicCases.returnsLargestNumberWithNDigits(2));
        assertEquals(999, BasicCases.returnsLargestNumberWithNDigits(3));
    }

}