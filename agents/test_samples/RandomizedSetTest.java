import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RandomizedSetTest {
    @Test
    void testRandomSet() {
        RandomizedSet set = new RandomizedSet();
        assertFalse(set.insert(1));
    }
}