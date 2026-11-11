package homework.h11;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    @DisplayName("Базовий випадок: [3, 2, 3] -> мажоритарний елемент 3")
    void testStandardCase() {
        int[] nums = {3, 2, 3};
        assertEquals(3, solver.majorityElement(nums));
    }

    @Test
    @DisplayName("Випадок з парною довжиною масиву: [2,2,1,1,1,2,2] -> 2")
    void testEvenLengthArray() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        assertEquals(2, solver.majorityElement(nums));
    }

    @Test
    @DisplayName("Масив з одного елемента")
    void testSingleElement() {
        int[] nums = {42};
        assertEquals(42, solver.majorityElement(nums));
    }

    @Test
    @DisplayName("Усі елементи масиву однакові")
    void testAllElementsSame() {
        int[] nums = {7, 7, 7, 7};
        assertEquals(7, solver.majorityElement(nums));
    }

    @Test
    @DisplayName("Масив містить від'ємні числа")
    void testWithNegativeNumbers() {
        int[] nums = {-1, -1, 2, -1, 5, -1, -1};
        assertEquals(-1, solver.majorityElement(nums));
    }

    @Test
    @DisplayName("Мажоритарний елемент зустрічається на початку і в кінці масиву")
    void testBoundaryOccurrences() {
        int[] nums = {6, 5, 5, 6, 6};
        assertEquals(6, solver.majorityElement(nums));
    }
}