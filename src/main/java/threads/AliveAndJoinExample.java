package threads;

public class AliveAndJoinExample extends Thread {

  public static int amount = 0;

  public static void main(String[] args) {
    AliveAndJoinExample thread = new AliveAndJoinExample();
    thread.start();
//    thread.join();
    while(thread.isAlive()) {
      System.out.println("waiting...");
    }
    System.out.println(amount);
    amount++;
    System.out.println(amount);
  }

  @Override
  public void run() {
    amount++;
  }
}
