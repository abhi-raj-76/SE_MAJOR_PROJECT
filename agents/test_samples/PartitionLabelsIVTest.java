import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartitionLabelsIVTest {
    @Test
    void testPartition() {
        assertEquals(0, PartitionLabelsIV.partitionLabels("ababcbacadefegdehijhklij").size()); // fails
    }
}