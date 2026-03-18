import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        // create a file object
        File file = new File("example.txt");

        // check if the file exists
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        // read the content of the file
        String content = Files.readString(file.toPath());

        // print the content to the console
        System.out.println(content);
    }
}