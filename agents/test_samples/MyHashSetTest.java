import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyHashSetTest {
    @Test
    void testHashSet() {
        MyHashSet set = new MyHashSet();
        set.add(1);
        assertTrue(set.contains(1)); // fails
    }
}