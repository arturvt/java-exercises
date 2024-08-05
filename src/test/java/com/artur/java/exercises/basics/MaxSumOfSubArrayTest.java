package com.artur.java.exercises.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MaxSumOfSubArrayTest {


  @Test
  void test_01() {
    int[] sequence = { -2, 2, 5, -11, 6};
    assertEquals(7, MaxSumOfSubArray.solutionBruteForce(sequence));
    assertEquals(7, MaxSumOfSubArray.solutionOptimized(sequence));
  }

  @Test
  void test_02() {
    int[] sequence = { -2, 2, 5, -11, 6, 12};
    assertEquals(18, MaxSumOfSubArray.solutionBruteForce(sequence));
    assertEquals(18, MaxSumOfSubArray.solutionOptimized(sequence));
  }

  @Test
  void test_03() {
    int[] sequence = { 1, 1, 1, 0, 2, 2};
    assertEquals(7, MaxSumOfSubArray.solutionBruteForce(sequence));
    assertEquals(7, MaxSumOfSubArray.solutionOptimized(sequence));
  }

  @Test
  void test_04() {
    int[] sequence = { 1, 1, 1, -2, 2, 2};
    assertEquals(5, MaxSumOfSubArray.solutionBruteForce(sequence));
    assertEquals(5, MaxSumOfSubArray.solutionOptimized(sequence));
  }

  @Test
  void test_05() {
    int[] sequence = { 1, 1, 1, -4, 2, 2};
    assertEquals(4, MaxSumOfSubArray.solutionBruteForce(sequence));
    assertEquals(4, MaxSumOfSubArray.solutionOptimized(sequence));
  }

}