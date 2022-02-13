package exceptions;

public class Customer {
  private String name;
  private int age;

  public Customer(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void validate() throws InvalidCustomerException {
    if(name.equals("") || age < 18) {
      throw new InvalidCustomerException("Invalid customer, name should be available and age should be greater than 18");
    }
  }

}
