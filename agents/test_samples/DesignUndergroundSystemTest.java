import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignUndergroundSystemTest {
    @Test
    void testSystem() {
        DesignUndergroundSystem system = new DesignUndergroundSystem();
        system.checkIn(45, "Leyton", 3);
        assertEquals(0.0, system.getAverageTime("Leyton", "Waterloo"));
    }
}