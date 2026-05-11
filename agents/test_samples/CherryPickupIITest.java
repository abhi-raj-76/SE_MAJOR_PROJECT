import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CherryPickupIITest {
    @Test
    void testCherry() {
        assertEquals(0, CherryPickupII.cherryPickup(new int[][]{{0}}));
    }
}