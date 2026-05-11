import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeNeededToBuyTicketsTest {
    @Test
    void testTime() {
        assertEquals(6, TimeNeededToBuyTickets.timeRequiredToBuy(new int[]{2,3,2}, 2));
    }
}