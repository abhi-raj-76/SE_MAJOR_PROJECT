import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueueReconstructionByHeightTest {
    @Test
    void testReconstruct() {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        assertArrayEquals(new int[][]{{5,0},{7,0},{5,2},{6,1},{4,4},{7,1}}, QueueReconstructionByHeight.reconstructQueue(people)); // fails
    }
}