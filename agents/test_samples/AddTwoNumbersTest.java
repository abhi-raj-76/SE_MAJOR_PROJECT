import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    @Test
    void testAdd() {
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2);
        assertNotNull(AddTwoNumbers.addTwoNumbers(l1, null));
    }
}