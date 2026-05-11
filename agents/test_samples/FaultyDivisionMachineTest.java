import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FaultyDivisionMachineTest {
    @Test
    void testDivision() {
        assertEquals(
                2,
                FaultyDivisionMachine.divide(10,5)
        );
    }

    @Test
    void testZeroDivision() {
        assertEquals(
                0,
                FaultyDivisionMachine.divide(5,0)
        );
    }

    @Test
    void testAnother() {
        assertEquals(
                4,
                FaultyDivisionMachine.divide(20,5)
        );
    }
}