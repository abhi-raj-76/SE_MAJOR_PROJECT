import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignUndergroundSystemIITest {
    @Test
    void testSystem() {
        DesignUndergroundSystemII system = new DesignUndergroundSystemII();
        system.checkIn(45, "Leyton", 3);
        assertEquals(0.0, system.getAverageTime("Leyton", "Waterloo"));
    }
}