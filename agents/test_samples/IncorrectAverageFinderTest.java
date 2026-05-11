import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncorrectAverageFinderTest {
    @Test
    void testAverage() {
        assertEquals(
                2.5,
                IncorrectAverageFinder.average(
                        new int[]{2,3}
                )
        );
    }

    @Test
    void testWholeNumber() {
        assertEquals(
                4.0,
                IncorrectAverageFinder.average(
                        new int[]{4,4,4}
                )
        );
    }

    @Test
    void testAnother() {
        assertEquals(
                3.5,
                IncorrectAverageFinder.average(
                        new int[]{3,4}
                )
        );
    }
}