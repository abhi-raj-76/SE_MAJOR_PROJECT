import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCalendarITest {
    @Test
    void testBook() {
        MyCalendarI cal = new MyCalendarI();
        assertTrue(cal.book(10, 20));
    }
}