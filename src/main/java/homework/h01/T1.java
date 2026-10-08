package homework.h01;

// base
// https://leetcode.com/problems/smallest-even-multiple/
public class T1 {
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }
}
