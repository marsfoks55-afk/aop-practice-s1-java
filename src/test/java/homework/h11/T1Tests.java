package homework.h11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T1Tests {

    private T1 solver;

    @BeforeEach
    void setUp() {
        solver = new T1();
    }

    @Test
    @DisplayName("Базовий випадок з LeetCode #268: [3, 0, 1] -> бракує 2")
    void testStandardCase() {
        int[] nums = {3, 0, 1};
        assertEquals(2, solver.missingNumber(nums));
    }

    @Test
    @DisplayName("Базовий випадок з LeetCode #268: бракує 8")
    void testSecondExample() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertEquals(8, solver.missingNumber(nums));
    }

    @Test
    @DisplayName("Бракує нульового елемента: [1] -> 0")
    void testMissingZero() {
        int[] nums = {1};
        assertEquals(0, solver.missingNumber(nums));
    }

    @Test
    @DisplayName("Бракує останнього найбільшого елемента n: [0, 1] -> 2")
    void testMissingLargestNumber() {
        int[] nums = {0, 1};
        assertEquals(2, solver.missingNumber(nums));
    }

    @Test
    @DisplayName("Одиничний елемент [0] -> бракує 1")
    void testSingleZero() {
        int[] nums = {0};
        assertEquals(1, solver.missingNumber(nums));
    }

    @Test
    @DisplayName("Порядок елементів довільний: [2, 1] -> бракує 0")
    void testUnsortedOrder() {
        int[] nums = {2, 1};
        assertEquals(0, solver.missingNumber(nums));
    }
}
