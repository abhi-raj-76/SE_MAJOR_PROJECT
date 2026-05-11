import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCalendarIIITest {
    @Test
    void testBook() {
        MyCalendarIII cal = new MyCalendarIII();
        assertTrue(cal.book(10, 20));
    }
}