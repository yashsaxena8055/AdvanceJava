package collections;

import exceptions.Customer;

import java.util.*;

public class BasicCollectionsExample {

  public static void main(String[] args) {
    addItemsToListAndPrint();
    binarySearchOnCustomers();
  }

  // Example 1
  public static void addItemsToListAndPrint() {
    List<String> items = new ArrayList();
    Collections.addAll(items, "Laptop", "Bat", "Mouse", "Phone");

    Collections.sort(items, Collections.reverseOrder());
    System.out.println(items);
  }

  // Example 2
  public static void addCustomersToListAndPrint() {
    // sample customer
    Customer rob = new Customer("Rob", 42);

    //TODO: add some more customers and then finally add them in a list using Collections.addAll(),
    //  sort them in reverse order based on name
    //  print the contents of the updated list
  }

  // Example 3
  /** BinarySearch: If the element exists in the list, the method will return the position of the
   *  element in the sorted list, otherwise, the result returned by the method would be the –
   *  insertion point where the element should have been present if exists. */
  public static void binarySearchOnCustomers() {
    //TODO: Copy the list of customers and list from the last example and perform a binary search
    Customer rob = new Customer("Rob", 42);

  }
}
