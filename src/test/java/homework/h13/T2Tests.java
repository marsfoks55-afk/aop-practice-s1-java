package homework.h13;

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
  @DisplayName("Базовий випадок #1: однакова кількість від'ємних і додатних (3 і 3)")
  void testEqualPosAndNeg() {
    int[] nums = {-2, -1, -1, 1, 2, 3};
    assertEquals(3, solver.maximumCount(nums));
  }

  @Test
  @DisplayName("Базовий випадок #2: масив містить нулі посередині (3 від'ємних, 2 додатних)")
  void testWithZerosInMiddle() {
    int[] nums = {-3, -2, -1, 0, 0, 1, 2};
    assertEquals(3, solver.maximumCount(nums));
  }

  @Test
  @DisplayName("Базовий випадок #3: усі числа додатні")
  void testAllPositive() {
    int[] nums = {5, 20, 66, 1314};
    assertEquals(4, solver.maximumCount(nums));
  }

  @Test
  @DisplayName("Усі числа від'ємні")
  void testAllNegative() {
    int[] nums = {-10, -5, -2, -1};
    assertEquals(4, solver.maximumCount(nums));
  }

  @Test
  @DisplayName("Масив складається виключно з нулів -> повертає 0")
  void testAllZeros() {
    int[] nums = {0, 0, 0, 0, 0};
    assertEquals(0, solver.maximumCount(nums));
  }

  @Test
  @DisplayName("Одиничний елемент: від'ємний, нуль, додатний")
  void testSingleElement() {
    assertEquals(1, solver.maximumCount(new int[] {-7}));
    assertEquals(0, solver.maximumCount(new int[] {0}));
    assertEquals(1, solver.maximumCount(new int[] {9}));
  }

  @Test
  @DisplayName("Граничні випадки: null або порожній масив")
  void testNullAndEmpty() {
    assertEquals(0, solver.maximumCount(null));
    assertEquals(0, solver.maximumCount(new int[] {}));
  }
}
