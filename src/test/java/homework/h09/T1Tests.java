package homework.h09;

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
    @DisplayName("Базовий приклад: повторювані елементи врозкид")
    void testStandardCase() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        assertEquals(4, solver.numIdenticalPairs(nums));
    }

    @Test
    @DisplayName("Усі елементи масиву однакові: C(4, 2) = 6")
    void testAllElementsEqual() {
        int[] nums = {1, 1, 1, 1};
        assertEquals(6, solver.numIdenticalPairs(nums));
    }

    @Test
    @DisplayName("Усі елементи унікальні: жодної пари")
    void testAllElementsUnique() {
        int[] nums = {1, 2, 3};
        assertEquals(0, solver.numIdenticalPairs(nums));
    }

    @Test
    @DisplayName("Мінімальна довжина: 2 однакові та 2 різні")
    void testTwoElements() {
        assertEquals(1, solver.numIdenticalPairs(new int[] {5, 5}));
        assertEquals(0, solver.numIdenticalPairs(new int[] {5, 6}));
    }

    @Test
    @DisplayName("Граничні випадки: null, порожній масив або 1 елемент")
    void testEdgeCases() {
        assertEquals(0, solver.numIdenticalPairs(null));
        assertEquals(0, solver.numIdenticalPairs(new int[] {}));
        assertEquals(0, solver.numIdenticalPairs(new int[] {42}));
    }

    @Test
    @DisplayName("Перевірка верхньої границі діапазону значень (100)")
    void testMaxConstraintValues() {
        int[] nums = {100, 100, 100};
        assertEquals(3, solver.numIdenticalPairs(nums));
    }
}