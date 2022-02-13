package threads.deadlock;

public class SimpleSync {
  private final Object key1 = new Object();
  private final Object key2 = new Object();

  public void first() {
    synchronized (key1) {
      System.out.println("[" + Thread.currentThread().getName() + "] I am in first()");
      second();
    }
  }

  public void second() {
    synchronized (key2) {
      System.out.println("[" + Thread.currentThread().getName() + "] I am in second()");
      third();
    }
  }

  public void third() {
    synchronized (key1) {
      System.out.println("[" + Thread.currentThread().getName() + "] I am in third()");
    }
  }
}
