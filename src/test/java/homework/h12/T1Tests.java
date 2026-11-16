package homework.h12;

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
    @DisplayName("LeetCode #1051: стандартний випадок")
    void testStandardCase() {
        int[] heights = {1, 1, 4, 2, 1, 3};
        assertEquals(3, solver.heightChecker(heights));
    }

    @Test
    @DisplayName("Усі елементи вже відсортовані")
    void testSortedArray() {
        int[] heights = {1, 2, 3, 4, 5};
        assertEquals(0, solver.heightChecker(heights));
    }

    @Test
    @DisplayName("Зворотний порядок елементів")
    void testReverseOrder() {
        int[] heights = {5, 4, 3, 2, 1};
        assertEquals(4, solver.heightChecker(heights));
    }

    @Test
    @DisplayName("Один елемент")
    void testSingleElement() {
        int[] heights = {1};
        assertEquals(0, solver.heightChecker(heights));
    }

    @Test
    @DisplayName("Однакові елементи")
    void testEqualElements() {
        int[] heights = {2, 2, 2, 2};
        assertEquals(0, solver.heightChecker(heights));
    }
}