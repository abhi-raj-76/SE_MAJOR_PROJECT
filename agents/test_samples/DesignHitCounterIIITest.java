import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignHitCounterIIITest {
    @Test
    void testHits() {
        DesignHitCounterIII counter = new DesignHitCounterIII();
        counter.hit(1);
        assertEquals(1, counter.getHits(1)); // fails
    }
}