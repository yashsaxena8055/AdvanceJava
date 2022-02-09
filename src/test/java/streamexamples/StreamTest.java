package streamexamples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamTest {
  List<Product> products;
  List<Order> orders;

  @BeforeEach
  public void setup() {
    DataGenerator data = new DataGenerator();
    products = data.products();
    orders = data.orders();
  }

  @Test
  @DisplayName("Get a list of products belonging to category 'Books' with price > 50")
  public void exercise1() {
    List<Product> expectedProducts = null;

    assertEquals(4, expectedProducts.size());
  }

  @Test
  @DisplayName("Get a list of products belonging to category 'Books' and price > 50 (using Predicate chaining for filter)")
  public void exercise2() {
    List<Product> expectedProducts = null;

    assertEquals(4, expectedProducts.size());
  }

  @Test
  @DisplayName("Get a list of products belonging to category 'Books' and price > 50 (using BiPredicate for filter)")
  public void exercise3() {
    List<Product> expectedProducts = null;

    assertEquals(4, expectedProducts.size());
  }

  @Test
  @DisplayName("Get a list of orders with products belonging to category 'Grocessory'")
  public void exercise4() {
    List<Order> expectedOrders = null;

    assertEquals(4, expectedOrders.size());
  }

  @Test
  @DisplayName("Get a list of products with category as GAMES and apply 15% discount")
  public void exercise5() {
    List<Product> expectedProducts = null;

    assertEquals(1, expectedProducts.size());
  }

  @Test
  @DisplayName("Get a list of products ordered by customer of tier 2 between 01-Apr-2010 and 31-Aug-2010")
  public void exercise6() {
    List<Order> expectedOrders = null;

    assertEquals(1, expectedOrders.size());
  }

  @Test
  @DisplayName("Get the cheapest products from Toys category")
  public void exercise7() {
    Product expected = null;

    assertEquals(95.46, expected.getPrice());
  }

  @Test
  @DisplayName("Get the 3 most recent placed order")
  public void exercise8() {
    List<Order> result = null;

    assertEquals(3, result.size());
  }

}