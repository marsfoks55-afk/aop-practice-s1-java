package homework.h09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
    @DisplayName("Базовий випадок з LeetCode #1")
    void testStandardExample() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> expected = Arrays.asList(true, true, true, false, true);
        assertEquals(expected, solver.kidsWithCandies(candies, extraCandies));
    }

    @Test
    @DisplayName("Випадок, коли лише одна дитина може досягти максимуму")
    void testSingleKidReachesMax() {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> expected = Arrays.asList(true, false, false, false, false);
        assertEquals(expected, solver.kidsWithCandies(candies, extraCandies));
    }

    @Test
    @DisplayName("Усі діти мають однакову кількість цукерок спочатку")
    void testAllKidsEqualInitially() {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        List<Boolean> expected = Arrays.asList(true, false, true);
        assertEquals(expected, solver.kidsWithCandies(candies, extraCandies));
    }

    @Test
    @DisplayName("Кількість додаткових цукерок настільки велика, що кожен досягає максимуму")
    void testLargeExtraCandies() {
        int[] candies = {1, 5, 10};
        int extraCandies = 20;
        List<Boolean> expected = Arrays.asList(true, true, true);
        assertEquals(expected, solver.kidsWithCandies(candies, extraCandies));
    }

    @Test
    @DisplayName("Граничні випадки: масив з одного елемента, порожній або null")
    void testEdgeCases() {
        assertEquals(Collections.singletonList(true), solver.kidsWithCandies(new int[] {5}, 2));
        assertEquals(Collections.emptyList(), solver.kidsWithCandies(new int[] {}, 5));
        assertEquals(Collections.emptyList(), solver.kidsWithCandies(null, 5));
    }
}