package homework.h08;

public class T1 {

  // https://leetcode.com/problems/max-consecutive-ones/

  public int findMaxConsecutiveOnes(int[] nums) {
    int current = 0;
    int max = 0;

    for (int num : nums) {
      if (num == 1) {
        current++;
        max = Math.max(max, current);
      } else {
        current = 0;
      }
    }

    return max;
  }
}