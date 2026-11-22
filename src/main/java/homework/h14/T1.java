package homework.h14;

public class T1 {
  public String removeDuplicates(String s) {
    if (s == null || s.isEmpty()) {
      return "";
    }

    StringBuilder stack = new StringBuilder(s.length());
    for (int i = 0; i < s.length(); i++) {
      char current = s.charAt(i);
      int lastIndex = stack.length() - 1;

      if (lastIndex >= 0 && stack.charAt(lastIndex) == current) {
        stack.deleteCharAt(lastIndex);
      } else {
        stack.append(current);
      }
    }

    return stack.toString();
  }
}
