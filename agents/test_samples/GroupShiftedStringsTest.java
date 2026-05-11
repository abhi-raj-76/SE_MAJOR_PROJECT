import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupShiftedStringsTest {
    @Test
    void testGroup() {
        assertEquals(0, GroupShiftedStrings.groupStrings(new String[]{"abc","bcd"}).size()); // fails
    }
}