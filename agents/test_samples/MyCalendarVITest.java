import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCalendarVITest {
    @Test
    void testBook() {
        MyCalendarVI cal = new MyCalendarVI();
        assertTrue(cal.book(10, 20));
    }
}