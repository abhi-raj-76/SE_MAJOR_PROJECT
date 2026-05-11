import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignHashMapIITest {
    @Test
    void testHashMap() {
        DesignHashMapII hm = new DesignHashMapII();
        hm.put(1, 1);
        assertEquals(1, hm.get(1));
    }
}