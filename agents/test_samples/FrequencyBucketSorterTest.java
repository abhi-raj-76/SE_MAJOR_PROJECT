import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FrequencyBucketSorterTest {
    @Test
    void testTopK() {
        FrequencyBucketSorter f =
                new FrequencyBucketSorter();

        int[] result =
                f.topK(
                        new int[]{1,1,1,2,2,3},
                        2
                );

        assertEquals(2, result.length);
    }

    @Test
    void testSingle() {
        FrequencyBucketSorter f =
                new FrequencyBucketSorter();

        int[] result =
                f.topK(new int[]{5},1);

        assertEquals(5, result[0]);
    }

    @Test
    void testDuplicates() {
        FrequencyBucketSorter f =
                new FrequencyBucketSorter();

        int[] result =
                f.topK(
                        new int[]{4,4,4,2},
                        1
                );

        assertEquals(4, result[0]);
    }
}