import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertDeleteGetRandomTest {
    @Test
    void testRandomizedSet() {
        InsertDeleteGetRandom set = new InsertDeleteGetRandom();
        assertTrue(set.insert(1));
        assertFalse(set.insert(1));
    }
}