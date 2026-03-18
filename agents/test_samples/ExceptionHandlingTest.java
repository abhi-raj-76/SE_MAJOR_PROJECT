import java.io.*;

public class ExceptionHandlingTest {
    @Test
    public void testExceptionHandling() {
        String input = "Something went wrong.";
        try {
            ExceptionHandling.main(new String[]{input});
        } catch (IOException e) {
            assertEquals(input, e.getMessage());
        } finally {
            assertTrue(true);
        }
    }
}