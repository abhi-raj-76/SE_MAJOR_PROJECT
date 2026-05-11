import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SeatReservationManagerTest {
    @Test
    void testManager() {
        SeatReservationManager manager = new SeatReservationManager(5);
        assertEquals(1, manager.reserve());
    }
}