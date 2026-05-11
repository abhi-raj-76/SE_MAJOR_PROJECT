import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartitionLabelsIIITest {
    @Test
    void testPartition() {
        assertEquals(0, PartitionLabelsIII.partitionLabels("ababcbacadefegdehijhklij").size()); // fails
    }
}