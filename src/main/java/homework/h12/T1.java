package homework.h12;

// LeetCode 1051: https://leetcode.com/problems/height-checker/

public class T1 {

    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();

        for (int i = 0; i < expected.length; i++) {
            for (int j = i + 1; j < expected.length; j++) {
                if (expected[i] > expected[j]) {
                    int temp = expected[i];
                    expected[i] = expected[j];
                    expected[j] = temp;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}