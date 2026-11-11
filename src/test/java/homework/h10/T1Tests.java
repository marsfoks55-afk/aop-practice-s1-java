
package homework.h10;

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
    @DisplayName("Базовий випадок: k = 1 повертає початковий символ 'a'")
    void testBaseCase() {
        assertEquals('a', solver.kthCharacter(1));
    }

    @Test
    @DisplayName("Перша ітерація розширення: k = 2 повертає 'b'")
    void testSecondCharacter() {
        assertEquals('b', solver.kthCharacter(2));
    }

    @Test
    @DisplayName("Приклад з LeetCode: k = 5 повертає 'b' (рядок: abbcbccd...)")
    void testFifthCharacter() {
        assertEquals('b', solver.kthCharacter(5));
    }

    @Test
    @DisplayName("Степені двійки: перевірка переходів на границях блоків")
    void testPowersOfTwo() {
        assertEquals('b', solver.kthCharacter(3));
        assertEquals('c', solver.kthCharacter(4));
        assertEquals('d', solver.kthCharacter(8));
    }

    @Test
    @DisplayName("Перевірка більших значень у межах умови задачі (k = 10, k = 500)")
    void testLargerValues() {
        assertEquals('c', solver.kthCharacter(10));
        // k = 500: Integer.bitCount(499) = 7 -> 'a' + 7 = 'h'
        assertEquals('h', solver.kthCharacter(500));
    }
}
