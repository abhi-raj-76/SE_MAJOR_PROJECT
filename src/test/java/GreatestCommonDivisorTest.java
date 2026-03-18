import java.util.Scanner;

public class GreatestCommonDivisorTest {
    @Test
    public void testGreatestCommonDivisor() {
        int n1 = 60;
        int n2 = 15;
        int gcd = GreatestCommonDivisor.gcd(n1, n2);
        assertEquals(3, gcd);
    }
}