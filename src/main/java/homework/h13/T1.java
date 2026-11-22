package homework.h13;

public class T1 extends VersionControl {
  public T1() {
    super();
  }

  public T1(int firstBad) {
    super(firstBad);
  }

  public int firstBadVersion(int n) {
    int left = 1;
    int right = n;

    while (left < right) {
      int mid = left + (right - left) / 2;
      if (isBadVersion(mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }
}
