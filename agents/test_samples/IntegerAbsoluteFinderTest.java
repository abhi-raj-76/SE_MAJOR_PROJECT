import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerAbsoluteFinderTest {
    @Test
    void testAbs() {
        IntegerAbsoluteFinder i = new IntegerAbsoluteFinder();
        assertEquals(7, i.abs(-7));
    }
}