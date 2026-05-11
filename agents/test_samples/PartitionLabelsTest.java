import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartitionLabelsTest {
    @Test
    void testPartition() {
        assertEquals(java.util.List.of(9,7,8), PartitionLabels.partitionLabels("ababcbacadefegdehijhklij"));
    }
}