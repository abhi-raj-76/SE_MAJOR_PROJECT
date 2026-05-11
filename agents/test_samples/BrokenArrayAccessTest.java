import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BrokenArrayAccessTest {
    @Test
    void testArray() {
        assertEquals(
                5,
                BrokenArrayAccess.getLast(
                        new int[]{1,2,3,4,5}
                )
        );
    }

    @Test
    void testSingle() {
        assertEquals(
                7,
                BrokenArrayAccess.getLast(
                        new int[]{7}
                )
        );
    }

    @Test
    void testEmpty() {
        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> BrokenArrayAccess.getLast(
                        new int[]{}
                )
        );
    }
}