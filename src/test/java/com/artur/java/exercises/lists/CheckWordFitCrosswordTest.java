package com.artur.java.exercises.lists;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class CheckWordFitCrosswordTest {

    private CheckWordFitCrossword underTest = new CheckWordFitCrossword();


    @Test
    void test_testLine_true() {
        assertTrue(underTest.testLine("#a  d", "abcd"));
        assertTrue(underTest.testLine(" #    ", "abcd"));
        assertTrue(underTest.testLine("#d   #", "abcd"));
        assertTrue(underTest.testLine("#d   ## # ", "abcd"));
    }

    @Test
    void test_testLine_false() {
        assertFalse(underTest.testLine("#a  d", "dbcd"));
        assertFalse(underTest.testLine("  d #", "bbcd"));
        assertFalse(underTest.testLine(" # #d   ", "abca"));
    }

    @Test
    void test_testCharSpace_true() {
        assertTrue(underTest.testCharSpace("a  d".toCharArray(), "abcd"));
        assertTrue(underTest.testCharSpace("    ".toCharArray(), "abcd"));
        assertTrue(underTest.testCharSpace("d   ".toCharArray(), "abcd"));
    }

    @Test
    void test_char_complex() {
        assertTrue(underTest.testCharSpace("  b a".toCharArray(), "abbcd"));
    }

    @Test
    void test_testCharSpace_false() {
        assertFalse(underTest.testCharSpace("a  d".toCharArray(), "dbcd"));
        assertFalse(underTest.testCharSpace("  d ".toCharArray(), "bbcd"));
        assertFalse(underTest.testCharSpace("d   ".toCharArray(), "abca"));
    }

    @Test
    void test_basic_01() {
        char[][] val = {{'#',' ', ' '}, {' ',' ', '#'},{'#',' ', '#'}};
        assertTrue(underTest.placeWordInCrossword(val, "abc"));
    }

    @Test
    void test_basic_02() {
        char[][] val = {{'#',' ', ' ', ' '}, {' ',' ', '#', ' '},{'#',' ', '#', ' '}};
        assertTrue(underTest.placeWordInCrossword(val, "abc"));
    }

    @Test
    void test_basic_03() {
        char[][] val = {{' ', '#', 'a'}, {' ', '#', 'c'},{' ', '#', 'a'}};
        assertFalse(underTest.placeWordInCrossword(val, "ac"));
    }

    @Test
    void test_basic_reverse_04() {
        char[][] val = {{'#', ' ', '#'},{' ', ' ', '#'},{'#', ' ', 'c'}};
        assertTrue(underTest.placeWordInCrossword(val, "ca"));
    }

    @Test
    void test_basic_133() {
        char[][] val = {{' '},{'#'},{'o'},{' '},{'t'},{'m'},{'o'},{' '},{'#'},{' '}};
        assertTrue(underTest.placeWordInCrossword(val, "octmor"));
    }

    @Test
    void test_basic_150() {
        char[][] val = {{'z', ' '}, {' ', 'z'}};
        assertFalse(underTest.placeWordInCrossword(val, "a"));
    }

    @Test
    void test_word_exist() {
        char[][] val = {{'s', 'u'}, {' ', 'z'}, {'c', '#'}};
        assertTrue(underTest.placeWordInCrossword(val, "su"));
    }

    @Test
    void test_word_empty_big_space() {
        char[][] val = {{' ', ' ', ' ', ' ', ' '}};
        assertFalse(underTest.placeWordInCrossword(val, "aa"));
    }
    @Test
    void test_inverted_filled() {
        char[][] val = {{' ',' ','b',' ','a'}};
        assertTrue(underTest.placeWordInCrossword(val, "abbcd"));
    }
}