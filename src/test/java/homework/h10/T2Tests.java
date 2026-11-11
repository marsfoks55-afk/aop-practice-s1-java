package homework.h10;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T2Tests {
    private T2 solver;

    @BeforeEach
    void setUp() {
        solver = new T2();
    }

    @Test
    @DisplayName("Рядок непарної довжини: 'hello' -> 'olleh'")
    void testOddLengthString() {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        solver.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Рядок парної довжини з різним регістром: 'Hannah' -> 'hannaH'")
    void testEvenLengthString() {
        char[] input = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] expected = {'h', 'a', 'n', 'n', 'a', 'H'};
        solver.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Одиничний символ: масив лишається без змін")
    void testSingleCharacter() {
        char[] input = {'x'};
        char[] expected = {'x'};
        solver.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Два символи: ['a', 'b'] -> ['b', 'a']")
    void testTwoCharacters() {
        char[] input = {'a', 'b'};
        char[] expected = {'b', 'a'};
        solver.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Слово-паліндром не змінює свій порядок")
    void testPalindrome() {
        char[] input = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};
        char[] expected = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};
        solver.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Граничні випадки: null або порожній масив не викликають помилок")
    void testEdgeCases() {
        char[] empty = {};
        solver.reverseString(empty);
        assertArrayEquals(new char[] {}, empty);

        char[] nullArray = null;
        solver.reverseString(nullArray);
    }
}