import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TopFrequentElementFinderTest {
    @Test
    void testTopK() {
        TopFrequentElementFinder t =
                new TopFrequentElementFinder();

        assertArrayEquals(
                new int[]{1,2},
                t.top(new int[]{1,1,1,2,2,3},2)
        );
    }
}