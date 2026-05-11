import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SnapshotArrayTest {
    @Test
    void testSnapshot() {
        SnapshotArray sa = new SnapshotArray(3);
        sa.set(0, 5);
        assertEquals(0, sa.snap());
    }
}