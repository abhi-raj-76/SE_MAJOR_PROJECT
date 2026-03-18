import org.junit.Test;
import static org.junit.Assert.*;

public class GenericsExampleTest {
    @Test
    public void testGetValue() {
        GenericsExample<String> example = new GenericsExample<String>("Hello, world!");
        assertEquals("Hello, world!", example.getValue());
    }

    @Test
    public void testSetValue() {
        GenericsExample<Integer> example = new GenericsExample<Integer>(42);
        example.setValue(13);
        assertEquals(13, (int) example.getValue());
    }
}