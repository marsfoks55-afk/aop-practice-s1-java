package homework.h12;

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
    @DisplayName("LeetCode #1122: стандартний випадок")
    void testStandardCase() {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] expected = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};

        assertArrayEquals(expected, solver.relativeSortArray(arr1, arr2));
    }

    @Test
    @DisplayName("Усі елементи присутні в arr2")
    void testAllElementsInArr2() {
        int[] arr1 = {3, 1, 2};
        int[] arr2 = {2, 3, 1};
        int[] expected = {2, 3, 1};

        assertArrayEquals(expected, solver.relativeSortArray(arr1, arr2));
    }

    @Test
    @DisplayName("Елементи, яких немає в arr2, сортуються")
    void testRemainingElements() {
        int[] arr1 = {5, 3, 1, 4, 2};
        int[] arr2 = {3, 5};
        int[] expected = {3, 5, 1, 2, 4};

        assertArrayEquals(expected, solver.relativeSortArray(arr1, arr2));
    }

    @Test
    @DisplayName("Однакові елементи")
    void testDuplicates() {
        int[] arr1 = {2, 2, 1, 1};
        int[] arr2 = {2, 1};
        int[] expected = {2, 2, 1, 1};

        assertArrayEquals(expected, solver.relativeSortArray(arr1, arr2));
    }

    @Test
    @DisplayName("Один елемент")
    void testSingleElement() {
        int[] arr1 = {1};
        int[] arr2 = {1};
        int[] expected = {1};

        assertArrayEquals(expected, solver.relativeSortArray(arr1, arr2));
    }
}