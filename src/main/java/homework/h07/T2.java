
/**
 * LeetCode 1342: Number of Steps to Reduce a Number to Zero
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
public class T2 {
    public int numberOfSteps(int num) {
        int steps = 0;

        for (; num > 0; steps++) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
        }

        return steps;
    }
}
