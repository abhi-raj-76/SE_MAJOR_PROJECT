class Recursion {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
  }

  public static void factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
}

This Java class uses recursion to calculate the factorial of a given integer. The `factorial` method takes an integer `n` as input and returns the factorial of that number. The method uses the fact that the factorial of a number `n` can be calculated as the product of `n` and the factorial of `n - 1`. The base case of the recursion is when `n` is 0, in which case the method returns 1.

To use this class, you can call the `factorial` method with an integer argument, like this:

int result = Recursion.factorial(5);
System.out.println("The factorial of 5 is: " + result);

This would print "The factorial of 5 is: 120".

Note that this is just a simple example of recursion, and there are many more complex and useful applications of the concept.