
package homework.h06;

import java.util.Arrays;

/**
 * LeetCode 242: Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 */
public class T1 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
