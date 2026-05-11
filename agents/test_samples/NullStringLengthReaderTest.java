import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NullStringLengthReaderTest {
    @Test
    void testNormal() {
        NullStringLengthReader n =
                new NullStringLengthReader();

        assertEquals(5,
                n.length("hello"));
    }

    @Test
    void testEmpty() {
        NullStringLengthReader n =
                new NullStringLengthReader();

        assertEquals(0,
                n.length(""));
    }

    @Test
    void testNull() {
        NullStringLengthReader n =
                new NullStringLengthReader();

        assertThrows(
                NullPointerException.class,
                () -> n.length(null)
        );
    }
}