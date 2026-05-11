import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CherryPickupTest {
    @Test
    void testCherry() {
        assertEquals(0, CherryPickup.cherryPickup(new int[][]{{0}}));
    }
}