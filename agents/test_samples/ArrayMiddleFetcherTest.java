import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayMiddleFetcherTest {
    @Test
    void testOddLength() {
        assertEquals(
                3,
                ArrayMiddleFetcher.middle(
                        new int[]{1,2,3,4,5}
                )
        );
    }

    @Test
    void testSingle() {
        assertEquals(
                7,
                ArrayMiddleFetcher.middle(
                        new int[]{7}
                )
        );
    }

    @Test
    void testAnother() {
        assertEquals(
                5,
                ArrayMiddleFetcher.middle(
                        new int[]{4,5,6}
                )
        );
    }
}