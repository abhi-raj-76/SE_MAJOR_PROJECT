import java.io.File;
import java.io.IOException;

public class FileHandlingTest {
  @Test
  public void testCreateNewFile() {
    File file = new File("example.txt");
    try {
      file.createNewFile();
      assertTrue(file.exists());
    } catch (IOException e) {
      assertFalse(e.getMessage(), true);
    }
  }
}