import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class PartitionLabelsVITest {
    @Test
    void testPartition() {
        PartitionLabelsVI solver = new PartitionLabelsVI();
        List<Integer> result = solver.partitionLabels("ababcbacadefegdehijhklij");
        assertTrue(result.size() > 1);
    }
}