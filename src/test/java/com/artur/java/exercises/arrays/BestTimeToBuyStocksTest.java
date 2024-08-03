package com.artur.java.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BestTimeToBuyStocksTest {


    private BestTimeToBuyStocks underTest;

    @Test
    void test_01() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, BestTimeToBuyStocks.maxProfit(prices));
    }

    @Test
    void test_02() {
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, BestTimeToBuyStocks.maxProfit(prices));
    }

    @Test
    void test_03 () {
        int[] prices = {2,1, 4};
        assertEquals(3, BestTimeToBuyStocks.maxProfit(prices));
    }

    @Test
    void test_04() {
        int[] prices = {3,3,5,0,0,3,1,4};
        assertEquals(4, BestTimeToBuyStocks.maxProfit(prices));
    }

}