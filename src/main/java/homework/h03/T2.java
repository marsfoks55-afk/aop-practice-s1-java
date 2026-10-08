package homework.h03;

// advanced
// https://leetcode.com/problems/reverse-integer/
public class T2 {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result < Integer.MIN_VALUE || result > Integer.MAX_VALUE ? 0 : (int) result;
    }
}
