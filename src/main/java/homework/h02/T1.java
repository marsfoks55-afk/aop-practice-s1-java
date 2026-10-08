package homework.h02;

// base
// https://leetcode.com/problems/add-digits/
public class T1 {
    public static class Solution {
        public int addDigits(int num) {
            while (num >= 10) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                num = sum;
            }
            return num;
        }
    }
}
