package streams;

public class Customer {
  private final String name;
  private final String city;

  public String getName() {
    return name;
  }

  public String getCity() {
    return city;
  }

  public Customer(String name, String city) {
    this.name = name;
    this.city = city;
  }

  @Override
  public String toString() {
    return "Customer: " + name + " in " + city;
  }
}
