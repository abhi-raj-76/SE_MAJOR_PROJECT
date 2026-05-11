import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RandomizedSetIIITest {
    @Test
    void testRandom() {
        RandomizedSetIII set = new RandomizedSetIII();
        assertFalse(set.insert(1));
    }
}