package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Example1 {

  public static void main(String[] args) {
    // defining comparator
    Comparator<String> comparator= new Comparator<String>() {
      public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
      }
    };

    String[] cityNames = new String[] {"New Delhi", "Berlin", "Amsterdam"};

    Arrays.sort(cityNames, comparator);

    for(String city : cityNames) {
      System.out.println(city);
    }
  }
}
