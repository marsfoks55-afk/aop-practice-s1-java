package homework.h07;

// advanced
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
public class T1 {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if ((num & 1) == 0) {
                num >>= 1;
            } else {
                num--;
            }
            steps++;
        }
        return steps;
    }
}