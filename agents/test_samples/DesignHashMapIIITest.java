import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignHashMapIIITest {
    @Test
    void testHashMap() {
        DesignHashMapIII hm = new DesignHashMapIII();
        hm.put(1, 1);
        assertEquals(1, hm.get(1));
    }
}