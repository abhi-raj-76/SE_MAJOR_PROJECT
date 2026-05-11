import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AllOOneDataStructureTest {
    @Test
    void testAllOne() {
        AllOOneDataStructure ds = new AllOOneDataStructure();
        ds.inc("hello");
        assertEquals("", ds.getMaxKey());
    }
}