package homework.h14;

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
  @DisplayName("Базовий випадок з LeetCode #1: 'abbaca' -> 'ca'")
  void testStandardExample1() {
    assertEquals("ca", solver.removeDuplicates("abbaca"));
  }

  @Test
  @DisplayName("Базовий випадок з LeetCode #2: каскадне схлопування 'azxxzy' -> 'ay'")
  void testStandardExample2() {
    assertEquals("ay", solver.removeDuplicates("azxxzy"));
  }

  @Test
  @DisplayName("Повне знищення всіх символів у симетричному рядку: 'abba' -> ''")
  void testCompleteCancellation() {
    assertEquals("", solver.removeDuplicates("abba"));
    assertEquals("", solver.removeDuplicates("aabbcc"));
  }

  @Test
  @DisplayName("Рядок без жодних сусідніх дублікатів залишається незмінним")
  void testNoDuplicates() {
    assertEquals("abcdef", solver.removeDuplicates("abcdef"));
  }

  @Test
  @DisplayName("Серія однакових символів: парна та непарна кількість")
  void testIdenticalCharactersSeries() {
    assertEquals("", solver.removeDuplicates("aaaa"));
    assertEquals("a", solver.removeDuplicates("aaaaa"));
  }

  @Test
  @DisplayName("Одиничний символ: рядок довжини 1")
  void testSingleCharacter() {
    assertEquals("z", solver.removeDuplicates("z"));
  }

  @Test
  @DisplayName("Граничні випадки: null або порожній рядок")
  void testNullAndEmptyInputs() {
    assertEquals("", solver.removeDuplicates(null));
    assertEquals("", solver.removeDuplicates(""));
  }
}
