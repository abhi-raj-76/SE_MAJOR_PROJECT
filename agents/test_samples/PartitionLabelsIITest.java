import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartitionLabelsIITest {
    @Test
    void testPartition() {
        assertEquals(0, PartitionLabelsII.partitionLabels("ababcbacadefegdehijhklij").size()); // fails
    }
}