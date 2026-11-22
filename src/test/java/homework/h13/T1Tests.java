package homework.h13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
  @DisplayName("Базовий випадок з LeetCode #1: n = 5, перша погана = 4")
  void testStandardExample() {
    solver.setFirstBadVersion(4);
    assertEquals(4, solver.firstBadVersion(5));
    assertTrue(solver.getApiCallCount() <= 4);
  }

  @Test
  @DisplayName("Базовий випадок з LeetCode #2: n = 1, перша погана = 1")
  void testSingleVersion() {
    solver.setFirstBadVersion(1);
    assertEquals(1, solver.firstBadVersion(1));
    assertEquals(0, solver.getApiCallCount());
  }

  @Test
  @DisplayName("Перша версія одразу дефектна: n = 10, bad = 1")
  void testFirstVersionIsBad() {
    solver.setFirstBadVersion(1);
    assertEquals(1, solver.firstBadVersion(10));
  }

  @Test
  @DisplayName("Дефектною є лише остання версія: n = 10, bad = 10")
  void testLastVersionIsBad() {
    solver.setFirstBadVersion(10);
    assertEquals(10, solver.firstBadVersion(10));
  }

  @Test
  @DisplayName("Масив із двох версій: перевірка обох граничних позицій")
  void testTwoVersions() {
    solver.setFirstBadVersion(1);
    assertEquals(1, solver.firstBadVersion(2));

    solver.setFirstBadVersion(2);
    assertEquals(2, solver.firstBadVersion(2));
  }

  @Test
  @DisplayName(
      "Захист від переповнення int при великих значеннях n (близьких до Integer.MAX_VALUE)")
  void testLargeNNoIntegerOverflow() {
    int n = 2_126_753_390;
    int bad = 1_702_766_719;
    solver.setFirstBadVersion(bad);

    assertEquals(bad, solver.firstBadVersion(n));
    assertTrue(solver.getApiCallCount() <= 32);
  }
}
