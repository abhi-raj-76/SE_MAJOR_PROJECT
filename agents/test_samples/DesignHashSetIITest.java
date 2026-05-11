import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignHashSetIITest {
    @Test
    void testHashSet() {
        DesignHashSetII set = new DesignHashSetII();
        set.add(1);
        assertFalse(set.contains(1)); // fails
    }
}