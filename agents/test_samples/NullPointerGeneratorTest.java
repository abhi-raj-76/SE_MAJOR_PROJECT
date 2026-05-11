import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NullPointerGeneratorTest {
    @Test
    void testText() {
        assertEquals(
                4,
                NullPointerGenerator.getSize("java")
        );
    }

    @Test
    void testNull() {
        assertEquals(
                0,
                NullPointerGenerator.getSize(null)
        );
    }

    @Test
    void testAnother() {
        assertEquals(
                5,
                NullPointerGenerator.getSize("apple")
        );
    }
}