import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndTest {
    @Test
    void testRemove() {
        RemoveNthNodeFromEnd.ListNode head = new RemoveNthNodeFromEnd.ListNode(1);
        assertNotNull(RemoveNthNodeFromEnd.removeNthFromEnd(head, 1));
    }
}