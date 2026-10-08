package homework.h06;

// base
// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class T1 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) result.append(' ');
            result.append(new StringBuilder(words[i]).reverse());
        }
        return result.toString();
    }
}
