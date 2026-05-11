import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsIVTest {
    @Test
    void testMinRooms() {
        assertEquals(0, MeetingRoomsIV.minMeetingRooms(new int[][]{}));
    }
}