import java.util.Scanner;

public class BinarySearchTest {
    @Test
    public void testSearch() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        assertEquals(2, BinarySearch.search(arr, 3));
    }

    @Test
    public void testSearchOutOfRange() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        assertEquals(-1, BinarySearch.search(arr, 10));
    }

    @Test
    public void testSearchEmpty() {
        int[] arr = {};
        assertEquals(-1, BinarySearch.search(arr, 10));
    }
}