package threads.racecondition;

public class RaceCondition {

  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter(0);

    Runnable r = new Runnable() {
      @Override
      public void run() {
        for(int i = 0; i < 1000; i++) {
          counter.increment();
        }
      }
    };

    //TODO: write code to create several threads and pass the runnable to it.

    //TODO: Also join all the threads so that the program waits for all the threads to get completed.

    // print the final value
    System.out.println(counter.get());
  }
}
