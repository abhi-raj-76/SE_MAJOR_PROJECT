```
import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        // Read from a file
        String filename = "example.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

        // Write to a file
        String output = "Hello, World!";
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(output);
        writer.close();
    }
}
```