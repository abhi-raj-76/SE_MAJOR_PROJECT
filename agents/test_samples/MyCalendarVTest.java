import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCalendarVTest {
    @Test
    void testBook() {
        MyCalendarV cal = new MyCalendarV();
        assertTrue(cal.book(10, 20));
    }
}