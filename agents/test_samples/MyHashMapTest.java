import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {
    @Test
    void testHashMap() {
        MyHashMap map = new MyHashMap();
        map.put(1, 1);
        assertEquals(1, map.get(1));
    }
}