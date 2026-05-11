import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCalendarVIITest {
    @Test
    void testBook() {
        MyCalendarVII cal = new MyCalendarVII();
        assertTrue(cal.book(10, 20));
    }
}