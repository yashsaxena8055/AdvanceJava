package streamexamples;

import java.util.Objects;

public class Product {
  private final int id;
  private final String name;
  private final String category;
  private final Double price;

  public Product(int id, String name, Category category, Double price) {
    this.id = id;
    this.name = name;
    this.category = category.toString();
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getCategory() {
    return category;
  }

  public Double getPrice() {
    return price;
  }

  public Product withPrice(Double price) {
    return new Product(this.id, this.name, Category.valueOf(this.category), price);
  }

  @Override
  public String toString() {
    return "Product{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", category='" + category + '\'' +
        ", price=" + price +
        '}';
  }

}
