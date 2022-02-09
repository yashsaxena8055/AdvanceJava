package streamexamples;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static streamexamples.Category.*;
import static streamexamples.Status.NEW;

public class Runner {
  public static void main(String[] args) {
    Customer stefan = new Customer(1, "Stefan", 1);
    Customer rob = new Customer(2, "Rob", 2);

    Product pulses = new Product(1, "Pulses", GROCESSORY, 100.0);
    Product book1 = new Product(2, "Learning Java Streams", BOOKS, 55.0);

    List<Product> products = asList(pulses, book1);

    Order order1 = new Order(1,
        LocalDate.of(2011, 10, 20),
        LocalDate.of(2011, 10, 22),
        NEW,
        stefan,
        Set.of(pulses, book1)
    );

    // Get a list of products belonging to category “Books” with price > 50
    System.out.println(products.stream()
        .filter(p -> p.getCategory().equals(BOOKS.toString()) && p.getPrice() >= 50.0)
        .collect(Collectors.toList()));
  }


}
