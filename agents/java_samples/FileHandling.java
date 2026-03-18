import java.io.File;
import java.io.IOException;

public class FileHandling {
  public static void main(String[] args) {
    File file = new File("example.txt");
    try {
      file.createNewFile();
      System.out.println("File created successfully.");
    } catch (IOException e) {
      System.out.println("Error creating file.");
    }
  }
}