package homework.h13;

public class VersionControl {
  private int firstBad;
  private int apiCallCount;

  public VersionControl() {}

  public VersionControl(int firstBad) {
    this.firstBad = firstBad;
  }

  public void setFirstBadVersion(int firstBad) {
    this.firstBad = firstBad;
    this.apiCallCount = 0;
  }

  public int getApiCallCount() {
    return apiCallCount;
  }

  protected boolean isBadVersion(int version) {
    apiCallCount++;
    return version >= firstBad;
  }
}
