import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortedMergeProcessorTest {
    @Test
    void testMerge() {
        SortedMergeProcessor s =
                new SortedMergeProcessor();

        int[] result =
                s.merge(
                        new int[]{1,3},
                        new int[]{2,4}
                );

        assertEquals(1, result[0]);
    }

    @Test
    void testLength() {
        SortedMergeProcessor s =
                new SortedMergeProcessor();

        int[] result =
                s.merge(
                        new int[]{1},
                        new int[]{2}
                );

        assertEquals(2, result.length);
    }

    @Test
    void testAnother() {
        SortedMergeProcessor s =
                new SortedMergeProcessor();

        int[] result =
                s.merge(
                        new int[]{5,6},
                        new int[]{1,2}
                );

        assertEquals(1, result[0]);
    }
}