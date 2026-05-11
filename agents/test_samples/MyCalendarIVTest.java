import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCalendarIVTest {
    @Test
    void testBook() {
        MyCalendarIV cal = new MyCalendarIV();
        assertTrue(cal.book(10, 20));
    }
}