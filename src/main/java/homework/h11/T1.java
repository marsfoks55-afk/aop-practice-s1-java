package homework.h11;

// base
// https://leetcode.com/problems/missing-number/
public class T1 {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}