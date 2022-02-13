package threads.racecondition;

public class Counter {
  private long l;

  public Counter(long l) {
    this.l = l;
  }

  public long get() {
    return l;
  }

  public void increment() {
    l = l + 1;
  }
}
