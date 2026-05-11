import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NullArrayTraverserTest {
    @Test
    void testLength() {
        NullArrayTraverser n =
                new NullArrayTraverser();

        assertEquals(
                3,
                n.length(new int[]{1,2,3})
        );
    }

    @Test
    void testNull() {
        NullArrayTraverser n =
                new NullArrayTraverser();

        assertThrows(
                NullPointerException.class,
                () -> n.length(null)
        );
    }
}