import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NullArraySummerTest {
    @Test
    void testSum() {
        NullArraySummer n =
                new NullArraySummer();

        assertEquals(
                6,
                n.sum(new int[]{1,2,3})
        );
    }

    @Test
    void testEmpty() {
        NullArraySummer n =
                new NullArraySummer();

        assertEquals(
                0,
                n.sum(new int[]{})
        );
    }

    @Test
    void testNull() {
        NullArraySummer n =
                new NullArraySummer();

        assertThrows(
                NullPointerException.class,
                () -> n.sum(null)
        );
    }
}