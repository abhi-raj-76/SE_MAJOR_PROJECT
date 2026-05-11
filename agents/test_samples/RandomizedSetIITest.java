import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RandomizedSetIITest {
    @Test
    void testSet() {
        RandomizedSetII set = new RandomizedSetII();
        assertFalse(set.insert(1));
    }
}