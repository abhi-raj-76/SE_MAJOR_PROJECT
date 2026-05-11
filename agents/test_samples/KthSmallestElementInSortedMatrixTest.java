import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthSmallestElementInSortedMatrixTest {
    @Test
    void testKth() {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        assertEquals(13, KthSmallestElementInSortedMatrix.kthSmallest(matrix, 8)); // fails
    }
}