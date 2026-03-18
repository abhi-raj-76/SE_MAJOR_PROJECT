public class ExceptionHandlingExample {
  public static void main(String[] args) {
    try {
      int x = 10;
      int y = 0;
      int z = x / y;
      System.out.println(z);
    } catch (ArithmeticException e) {
      System.out.println("Division by zero not allowed");
    }
  }
}