
package homework.h04;

// LeetCode 461 - Hamming Distance
// https://leetcode.com/problems/hamming-distance/
public class T1 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
