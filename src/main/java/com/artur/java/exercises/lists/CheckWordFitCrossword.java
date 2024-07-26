package com.artur.java.exercises.lists;


/**
 * From <a href="https://leetcode.com/problems/check-if-word-can-be-placed-in-crossword/description/">...</a>
 * ' ' means EMPTY
 * "#" represent block cells, the black ones.
 * Words can be vertical and horizontal.
 */
public class CheckWordFitCrossword {
    public boolean placeWordInCrossword(char[][] crossword, String word) {
        int x = crossword.length;
        int y = crossword[0].length;
        if (word.length() <= y) {
            for (char[] line : crossword) {
                if (testLine(new String(line), word)) {
                    System.out.println("Found - line!");
                    return true;
                }
            }
        }
        if (word.length() <= x) {
            for (int i = 0; i < y; i++) {

                char[] row = new char[x];

                for (int j = 0; j < x; j++) {
                    row[j] = crossword[j][i];
                }
                if (testLine(new String(row), word)) {
                    System.out.println("Found - row!");
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * by a given line or row, it checks if word fits on it.
     * When # it means word can't be inserted there.
     * It receives: [_, _, #, _, #, _, _, _, _] and 'abcd' for example.
     * It will process it as ['_','_'], ['_'], ['_','_', '_', '_']; and will return true if 'abcd' fits on any of them.
     */
    public boolean testLine(String line, String word) {
        String[] spaces = line.split("#");
        for (String space : spaces) {
            if (testCharSpace(space.toCharArray(), word)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Given a char space, checks if word fits on it. Left/right and right/left
     */
     boolean testCharSpace(char[] line, String word) {
        if (line.length != word.length()) {
            return false;
        }
        boolean testLeft = true;
        boolean testRight = true;
        for (int i = 0; i < line.length; i++) {
            char spaceLeft = line[i];
            char spaceRight = line[line.length - 1 - i];

            char wordChar = word.charAt(i);

            if (spaceLeft != ' ' && spaceLeft != wordChar && testLeft) {
                // proceed
                testLeft = false;
            }
            if (spaceRight != ' ' && spaceRight != wordChar && testRight) {
                testRight = false;
            }
            if (!testLeft && !testRight) {
                return false;
            }
        }
        return true;
    }
}
