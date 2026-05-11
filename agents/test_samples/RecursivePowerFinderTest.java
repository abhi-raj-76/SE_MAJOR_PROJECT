import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursivePowerFinderTest {
    @Test
    void testPower() {
        RecursivePowerFinder r =
                new RecursivePowerFinder();

        assertEquals(8, r.power(2,3));
    }

    @Test
    void testOne() {
        RecursivePowerFinder r =
                new RecursivePowerFinder();

        assertEquals(1, r.power(5,0));
    }

    @Test
    void testSquare() {
        RecursivePowerFinder r =
                new RecursivePowerFinder();

        assertEquals(25, r.power(5,2));
    }
}