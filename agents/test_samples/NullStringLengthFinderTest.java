import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NullStringLengthFinderTest {
    @Test
    void testLength() {
        assertEquals(
                5,
                NullStringLengthFinder.length("hello")
        );
    }

    @Test
    void testEmpty() {
        assertEquals(
                0,
                NullStringLengthFinder.length("")
        );
    }

    @Test
    void testNull() {
        assertThrows(
                NullPointerException.class,
                () -> NullStringLengthFinder.length(null)
        );
    }
}