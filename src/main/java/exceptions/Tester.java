package exceptions;

public class Tester {

  public static void main(String[] args) {
    Customer customer = new Customer("", 20);

    try {
      customer.validate();
      System.out.println("You can join the club...");
    } catch (InvalidCustomerException e) {
      e.printStackTrace();
    }
  }
}
