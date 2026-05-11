import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RandomizedSetIVTest {
    @Test
    void testRandom() {
        RandomizedSetIV set = new RandomizedSetIV();
        assertFalse(set.insert(1));
    }
}