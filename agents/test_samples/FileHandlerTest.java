import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class FileHandlerTest {

    @Test
    void testFileCreation() {
        File file = new File("path/to/file.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertTrue(file.exists());

        try {
            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertFalse(file.exists());
    }

}