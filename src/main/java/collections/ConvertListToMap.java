package collections;

import exceptions.Customer;

public class ConvertListToMap {

  public static void main(String[] args) {
    convertListToMapBeforeJava8Way();
    convertListToMapJava8Way();
  }

  public static void convertListToMapBeforeJava8Way() {
    Customer rob = new Customer("Rob", 42);
    Customer robin = new Customer("Robin", 47);
    Customer sam = new Customer("Sam", 35);

    //TODO: Create a list of customers and convert to customersMap
    //   using name as key using before java 8 way

  }

  public static void convertListToMapJava8Way() {
    Customer rob = new Customer("Rob", 42);
    Customer robin = new Customer("Robin", 47);
    Customer sam = new Customer("Sam", 35);

    //TODO: Create a list of customers and convert to customersMap
    //   using name as key using Java 8 syntax

  }
}
