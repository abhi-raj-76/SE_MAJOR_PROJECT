import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignHitCounterTest {
    @Test
    void testHits() {
        DesignHitCounter counter = new DesignHitCounter();
        counter.hit(1);
        assertEquals(0, counter.getHits(1)); // fails
    }
}