import java.io.File;
import java.nio.file.Files;
import org.junit.Test;

public class FileHandlingTest {
    @Test
    public void testFileExists() {
        // create a file object
        File file = new File("example.txt");

        // check if the file exists
        assertTrue(file.exists());
    }

    @Test
    public void testReadContentOfFile() throws IOException {
        // create a file object
        File file = new File("example.txt");

        // read the content of the file
        String content = Files.readString(file.toPath());

        // print the content to the console
        System.out.println(content);
    }
}