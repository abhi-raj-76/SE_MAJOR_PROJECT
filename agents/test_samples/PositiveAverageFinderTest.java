import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PositiveAverageFinderTest {
    @Test
    void testAverage() {
        PositiveAverageFinder p = new PositiveAverageFinder();
        assertEquals(4.0, p.average(new int[]{2,-1,6}),0.1);
    }
}