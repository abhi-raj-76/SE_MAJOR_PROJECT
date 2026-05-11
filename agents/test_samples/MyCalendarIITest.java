import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCalendarIITest {
    @Test
    void testBook() {
        MyCalendarII cal = new MyCalendarII();
        assertTrue(cal.book(10, 20));
    }
}