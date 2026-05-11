import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeBasedKeyValueStoreIITest {
    @Test
    void testTimeMap() {
        TimeBasedKeyValueStoreII tm = new TimeBasedKeyValueStoreII();
        tm.set("foo", "bar", 1);
        assertEquals("bar", tm.get("foo", 1));
    }
}