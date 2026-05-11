import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomSchedulerTest {
    @Test
    void testMeetingRooms() {
        MeetingRoomScheduler m =
                new MeetingRoomScheduler();

        assertFalse(
                m.attend(
                        new int[][]{
                                {0,30},
                                {5,10},
                                {15,20}
                        }
                )
        );
    }
}