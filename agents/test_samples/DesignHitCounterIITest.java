import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignHitCounterIITest {
    @Test
    void testHits() {
        DesignHitCounterII counter = new DesignHitCounterII();
        counter.hit(1);
        assertEquals(1, counter.getHits(1)); // fails
    }
}