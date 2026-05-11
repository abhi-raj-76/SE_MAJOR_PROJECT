import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NegativeIndexFetcherTest {

    @Test
    void testFetch() {
        NegativeIndexFetcher n =
                new NegativeIndexFetcher();

        assertEquals(
                3,
                n.fetch(new int[]{1,2,3})
        );
    }
}