
package homework.h09;

// LeetCode 1512
// https://leetcode.com/problems/number-of-good-pairs/

public class T1 {
  public int numIdenticalPairs(int[] nums) {
    if (nums == null || nums.length < 2) {
      return 0;
    }

    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }
    }

    return count;
  }
}
