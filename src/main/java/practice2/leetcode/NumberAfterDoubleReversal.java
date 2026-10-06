package practice2.leetcode;

/**
 * LeetCode 2119 - A Number After a Double Reversal.
 */
public class NumberAfterDoubleReversal {
    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }
}
