
package homework.h09;

// LeetCode 1431
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.List;

public class T2 {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> result = new ArrayList<>();

    if (candies == null) {
      return result;
    }

    int maxCandies = 0;

    for (int candy : candies) {
      maxCandies = Math.max(maxCandies, candy);
    }

    for (int candy : candies) {
      result.add(candy + extraCandies >= maxCandies);
    }

    return result;
  }
}
