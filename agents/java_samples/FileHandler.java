import java.io.File;
import java.io.IOException;

public class FileHandler {
    public static void main(String[] args) {
        File file = new File("path/to/file.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File created: " + file.exists());

        try {
            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File deleted: " + file.exists());
    }
}

This class creates a new file at the specified path, checks if it exists, and then deletes it. It uses the `File` class and the `createNewFile()` and `delete()` methods.