import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShuffleArrayTest {
    @Test
    void testShuffle() {
        ShuffleArray sa = new ShuffleArray(new int[]{1,2,3});
        assertArrayEquals(new int[]{1,2,3}, sa.reset());
    }
}