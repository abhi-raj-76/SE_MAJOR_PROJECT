import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayPeakDetectorTest {

    @Test
    void testPeak() {
        ArrayPeakDetector a =
                new ArrayPeakDetector();

        assertEquals(5,
                a.findPeak(new int[]{1,5,2}));
    }

    @Test
    void testEdgePeak() {
        ArrayPeakDetector a =
                new ArrayPeakDetector();

        assertEquals(10,
                a.findPeak(new int[]{10,2,1}));
    }
}