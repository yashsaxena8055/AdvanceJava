package streamexamples;

public class Customer {
  private final int id;
  private final String name;
  private final Integer tier;

  public Customer(int id, String name, int tier) {
    this.name = name;
    this.id = id;
    this.tier = tier;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getTier() {
    return tier;
  }
}

