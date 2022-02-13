package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRunner {

  public static void main(String[] args) {
    String fileName = "somefilename";
    try (Scanner file = new Scanner(new File(fileName))) {
      if (file.hasNextLine()) {
        System.out.println(file.nextLine());
      } else {
        throw new IllegalArgumentException("Non readable file");
      }
    } catch (FileNotFoundException err) {
      if(!containsExtension(fileName)) {
        throw new IncorrectFileExtensionException(
          "Filename does not contain extension : " + fileName, err);
      }
    }
  }

  private static boolean containsExtension(String fileName) {
    return false;
  }
}
