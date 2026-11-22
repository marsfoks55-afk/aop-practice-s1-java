package homework.h14;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T2Tests {
  private T2 queue;

  @BeforeEach
  void setUp() {
    queue = new T2();
  }

  @Test
  @DisplayName("Базовий сценарій з LeetCode: push(1), push(2), peek(), pop(), empty()")
  void testStandardLeetCodeSequence() {
    assertTrue(queue.empty());

    queue.push(1);
    queue.push(2);

    assertFalse(queue.empty());
    assertEquals(1, queue.peek());
    assertEquals(1, queue.pop());
    assertFalse(queue.empty());
    assertEquals(2, queue.pop());
    assertTrue(queue.empty());
  }

  @Test
  @DisplayName(
      "Перемішані операції push/pop/peek (перевірка, що outStack не затирається передчасно)")
  void testInterleavedPushAndPop() {
    queue.push(10);
    queue.push(20);
    assertEquals(10, queue.pop()); // inStack порожній, outStack містить [20]

    queue.push(30); // потрапляє в inStack, поки 20 чекає в outStack
    queue.push(40);

    assertEquals(20, queue.peek());
    assertEquals(20, queue.pop()); // тепер outStack спустошився
    assertEquals(30, queue.pop()); // перекладання з inStack у outStack
    assertEquals(40, queue.pop());
    assertTrue(queue.empty());
  }

  @Test
  @DisplayName("Перевірка суворого порядку FIFO на серії елементів")
  void testFifoOrderingForMultipleElements() {
    for (int i = 1; i <= 10; i++) {
      queue.push(i);
    }

    for (int i = 1; i <= 10; i++) {
      assertEquals(i, queue.peek());
      assertEquals(i, queue.pop());
    }
    assertTrue(queue.empty());
  }

  @Test
  @DisplayName("Робота з від'ємними числами, нулем та граничними значеннями Integer")
  void testBoundaryAndNegativeValues() {
    queue.push(Integer.MIN_VALUE);
    queue.push(0);
    queue.push(Integer.MAX_VALUE);

    assertEquals(Integer.MIN_VALUE, queue.pop());
    assertEquals(0, queue.pop());
    assertEquals(Integer.MAX_VALUE, queue.pop());
    assertTrue(queue.empty());
  }

  @Test
  @DisplayName("Повторні виклики peek не видаляють елемент із черги")
  void testPeekIdempotency() {
    queue.push(42);
    assertEquals(42, queue.peek());
    assertEquals(42, queue.peek());
    assertFalse(queue.empty());
  }

  @Test
  @DisplayName("Виняток при спробі викликати pop або peek на порожній черзі")
  void testOperationsOnEmptyQueueThrowException() {
    assertThrows(NoSuchElementException.class, () -> queue.pop());
    assertThrows(NoSuchElementException.class, () -> queue.peek());
  }
}
