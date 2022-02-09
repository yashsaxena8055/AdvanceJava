package streamexamples;

import java.time.LocalDate;
import java.util.Set;

public class Order {
  private final int id;
  private final LocalDate orderDate;
  private final LocalDate deliveryDate;
  private final String status;
  private final Customer customer;
  private Set<Product> products;

  public Order(int id, LocalDate orderDate, LocalDate deliveryDate, Status status, Customer customer, Set<Product> products) {
    this.id = id;
    this.orderDate = orderDate;
    this.deliveryDate = deliveryDate;
    this.status = status.toString();
    this.customer = customer;
    this.products = products;
  }

  public int getId() {
    return id;
  }

  public LocalDate getOrderDate() {
    return orderDate;
  }

  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }

  public String getStatus() {
    return status;
  }

  public Customer getCustomer() {
    return customer;
  }

  public Set<Product> getProducts() {
    return products;
  }

  @Override
  public String toString() {
    return "Order{" +
            "id=" + id +
            ", orderDate=" + orderDate +
            ", deliveryDate=" + deliveryDate +
            ", status='" + status + '\'' +
            ", customer=" + customer +
            ", products=" + products +
            '}';
  }
}