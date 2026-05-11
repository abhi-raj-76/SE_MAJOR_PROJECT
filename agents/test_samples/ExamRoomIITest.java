import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExamRoomIITest {
    @Test
    void testExamRoom() {
        ExamRoomII room = new ExamRoomII(10);
        assertEquals(0, room.seat());
    }
}