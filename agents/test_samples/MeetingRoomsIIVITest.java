import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsIIVITest {
    @Test
    void testRooms() {
        MeetingRoomsIIVI solver = new MeetingRoomsIIVI();
        assertEquals(2, solver.minMeetingRooms(new int[][]{{0,30},{5,10},{15,20}}));
    }
}