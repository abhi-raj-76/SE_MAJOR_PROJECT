import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsVIIITest {
    @Test
    void testMinRooms() {
        assertEquals(0, MeetingRoomsVIII.minMeetingRooms(new int[][]{}));
    }
}