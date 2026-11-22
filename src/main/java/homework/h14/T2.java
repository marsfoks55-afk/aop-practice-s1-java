package homework.h14;

import java.util.ArrayDeque;
import java.util.Deque;

public class T2 {
  private final Deque<Integer> inStack;
  private final Deque<Integer> outStack;

  public T2() {
    this.inStack = new ArrayDeque<>();
    this.outStack = new ArrayDeque<>();
  }

  public void push(int x) {
    inStack.push(x);
  }

  public int pop() {
    shiftStacksIfNeeded();
    return outStack.pop();
  }

  public int peek() {
    shiftStacksIfNeeded();
    return outStack.element();
  }

  public boolean empty() {
    return inStack.isEmpty() && outStack.isEmpty();
  }

  private void shiftStacksIfNeeded() {
    if (outStack.isEmpty()) {
      while (!inStack.isEmpty()) {
        outStack.push(inStack.pop());
      }
    }
  }
}
