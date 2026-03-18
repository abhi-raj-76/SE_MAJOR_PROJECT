import java.io.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // code that may throw an exception
            throw new IOException("Something went wrong.");
        } catch (IOException e) {
            // handle the exception
            System.out.println("An exception occurred: " + e.getMessage());
        } finally {
            // optional code to be executed whether an exception was thrown or not
            System.out.println("This will always be executed.");
        }
    }
}

Note: This code is for illustrative purposes only and should not be used in production.

In this example, we are using the `try`-`catch`-`finally` block to handle an exception. The `try` block contains the code that may throw an exception, and the `catch` block contains the code to handle the exception. The `finally` block contains code that should always be executed, regardless of whether an exception was thrown or not.

In this case, we are throwing a `IOException` with a message "Something went wrong." in the `try` block, and catching it in the `catch` block. The `catch` block simply prints the message of the exception to the console.

The `finally` block is executed at the end of the `try` block, regardless of whether an exception was thrown or not. In this case, it simply prints a message to the console to confirm that the code in the `finally` block was executed.

Note that the `finally` block is not mandatory, but it is often used to clean up resources or to perform some other action that should be done regardless of whether an exception was thrown or not.