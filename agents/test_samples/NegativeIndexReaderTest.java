import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NegativeIndexReaderTest {
    @Test
    void testRead() {
        NegativeIndexReader n =
                new NegativeIndexReader();

        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> n.read(new int[]{1,2,3})
        );
    }

    @Test
    void testSingle() {
        NegativeIndexReader n =
                new NegativeIndexReader();

        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> n.read(new int[]{5})
        );
    }

    @Test
    void testAnother() {
        NegativeIndexReader n =
                new NegativeIndexReader();

        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> n.read(new int[]{7,8})
        );
    }
}