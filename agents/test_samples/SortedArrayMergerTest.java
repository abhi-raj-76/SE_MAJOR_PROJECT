import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortedArrayMergerTest {

    @Test
    void testMerge() {
        SortedArrayMerger s =
                new SortedArrayMerger();

        int[] result =
                s.merge(
                        new int[]{1,3,5},
                        new int[]{2,4,6}
                );

        assertEquals(6, result.length);
        assertEquals(1, result[0]);
        assertEquals(6, result[5]);
    }
}