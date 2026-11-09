package homework.h10;

// LeetCode 3304
// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/

public class T1 {
  public char kthCharacter(int k) {
    int shifts = Integer.bitCount(k - 1);
    return (char) ('a' + shifts);
  }
}
