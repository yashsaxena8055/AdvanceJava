package streams;

import java.util.List;

import static java.util.Arrays.asList;

public class Runner {
  public static void main(String[] args) {
    Customer fred = new Customer("Fred", "Mumbai");
    Customer rob = new Customer("Rob", "Amsterdam");
    Customer mario = new Customer("Mario", "Milan");

    List<Transaction> transactions = asList(
        new Transaction(fred, 2011, 2000),
        new Transaction(mario, 2009, 1000),
        new Transaction(rob, 2012, 3500),
        new Transaction(rob, 2011, 4000)
    );
  }

}
