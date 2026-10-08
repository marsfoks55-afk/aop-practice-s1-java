package homework.h01;

// advanced
// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
public class T2 {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
