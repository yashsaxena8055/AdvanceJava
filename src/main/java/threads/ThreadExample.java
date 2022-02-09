package threads;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import static java.util.Arrays.asList;

public class ThreadExample {

  public static void main(String[] args) {
    List<String> links = asList(
      "http://google.com",
      "http://stackoverflow.com",
      "http://facebook.com",
      "http://amazon.com",
      "http://facebookblahblah.com"
    );


    for(String link: links) {
      testLink(link);
    }
  }

  private static void testLink(String site) {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = null;
    try {
      request = HttpRequest.newBuilder(new URI(site)).build();
      HttpResponse<String> response = null;
      client.send(request, HttpResponse.BodyHandlers.ofString());
      System.out.println(site + " is up!");

    } catch (URISyntaxException | IOException | InterruptedException e) {
      System.out.println(site + " might be down");
    }
  }
}
