import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SnapshotArrayIITest {
    @Test
    void testSnapshot() {
        SnapshotArrayII sa = new SnapshotArrayII(3);
        sa.set(0, 5);
        assertEquals(0, sa.snap());
    }
}