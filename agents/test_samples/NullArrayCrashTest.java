import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NullArrayCrashTest {
    @Test
    void testArray() {
        NullArrayCrash n =
                new NullArrayCrash();

        assertEquals(
                3,
                n.size(new int[]{1,2,3})
        );
    }

    @Test
    void testEmpty() {
        NullArrayCrash n =
                new NullArrayCrash();

        assertEquals(
                0,
                n.size(new int[]{})
        );
    }

    @Test
    void testNull() {
        NullArrayCrash n =
                new NullArrayCrash();

        assertThrows(
                NullPointerException.class,
                () -> n.size(null)
        );
    }
}