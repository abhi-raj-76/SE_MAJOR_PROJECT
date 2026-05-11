import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsVITest {
    @Test
    void testMinRooms() {
        assertEquals(0, MeetingRoomsVI.minMeetingRooms(new int[][]{}));
    }
}