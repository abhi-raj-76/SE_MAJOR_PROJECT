import java.util.Scanner;
import org.junit.Test;

public class ExceptionHandlingExampleTest {

  @Test
  public void testDivisionByZero() {
    ExceptionHandlingExample example = new ExceptionHandlingExample();
    int x = 10;
    int y = 0;
    try {
      example.divide(x, y);
    } catch (ArithmeticException e) {
      assertEquals("Division by zero not allowed", e.getMessage());
    }
  }

}