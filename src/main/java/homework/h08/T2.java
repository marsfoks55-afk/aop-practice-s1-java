package homework.h08;

import java.util.List;

public class T2 {

  // https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/

  public int countPairs(List<Integer> nums, int target) {
    int count = 0;

    for (int i = 0; i < nums.size(); i++) {
      for (int j = i + 1; j < nums.size(); j++) {
        if (nums.get(i) + nums.get(j) < target) {
          count++;
        }
      }
    }

    return count;
  }
}