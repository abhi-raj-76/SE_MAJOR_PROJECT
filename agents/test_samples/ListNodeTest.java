import java.util.Scanner;

import org.junit.Test;

public class ListNodeTest {

    @Test
    public void testPartition() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        int x = 3;
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode actual = Solution.partition(head, x);
        assertEquals(expected, actual);
    }

}