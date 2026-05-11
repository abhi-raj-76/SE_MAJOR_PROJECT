import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignHashSetIIITest {
    @Test
    void testHashSet() {
        DesignHashSetIII set = new DesignHashSetIII();
        set.add(1);
        assertFalse(set.contains(1)); // fails
    }
}