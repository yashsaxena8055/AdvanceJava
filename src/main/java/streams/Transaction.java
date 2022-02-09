package streams;

public class Transaction {
  private final Customer customer;
  private final int year;
  private final int value;

  public Customer getCustomer() {
    return customer;
  }

  public int getYear() {
    return year;
  }

  public int getValue() {
    return value;
  }

  public Transaction(Customer customer, int year, int value) {
    this.customer = customer;
    this.year = year;
    this.value = value;
  }

  @Override
  public String toString() {
    return "Transaction{" +
        "customer=" + customer +
        ", year=" + year +
        ", value=" + value +
        '}';
  }
}
