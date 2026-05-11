import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExamRoomTest {
    @Test
    void testExamRoom() {
        ExamRoom room = new ExamRoom(10);
        assertEquals(0, room.seat());
    }
}