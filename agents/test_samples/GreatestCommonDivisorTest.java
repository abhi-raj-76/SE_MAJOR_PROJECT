import java.util.Scanner;

public class GreatestCommonDivisorTest {
  @Test
  public void testGcd() {
    // Arrange
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();

    // Act
    int result = gcd.gcd(12, 15);

    // Assert
    assertEquals(3, result);
  }
}