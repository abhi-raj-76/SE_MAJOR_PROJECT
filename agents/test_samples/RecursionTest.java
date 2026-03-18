import java.util.Scanner;

public class RecursionTest {
    @Test
    public void testSum() {
        assertEquals(55, Recursion.sum(10));
        assertEquals(15, Recursion.sum(5));
        assertEquals(0, Recursion.sum(0));
    }
}