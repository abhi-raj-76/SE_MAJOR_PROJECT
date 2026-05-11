import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SeatReservationManagerIITest {
    @Test
    void testManager() {
        SeatReservationManagerII manager = new SeatReservationManagerII(5);
        assertEquals(1, manager.reserve());
    }
}