import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeBasedKeyValueStoreTest {
    @Test
    void testTimeMap() {
        TimeBasedKeyValueStore tm = new TimeBasedKeyValueStore();
        tm.set("foo", "bar", 1);
        assertEquals("bar", tm.get("foo", 1));
    }
}