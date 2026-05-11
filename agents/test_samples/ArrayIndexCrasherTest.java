import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayIndexCrasherTest {
    @Test
    void testCrash() {
        assertEquals(
                5,
                ArrayIndexCrasher.crash(
                        new int[]{5,6,7}
                )
        );
    }

    @Test
    void testSingle() {
        assertEquals(
                1,
                ArrayIndexCrasher.crash(
                        new int[]{1}
                )
        );
    }

    @Test
    void testAnother() {
        assertEquals(
                9,
                ArrayIndexCrasher.crash(
                        new int[]{9,2}
                )
        );
    }
}