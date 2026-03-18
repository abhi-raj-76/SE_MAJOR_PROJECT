import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadingExample {
  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(4);
    executor.execute(() -> {
      System.out.println("Thread 1");
    });
    executor.execute(() -> {
      System.out.println("Thread 2");
    });
    executor.shutdown();
  }
}

This code creates a fixed thread pool of size 4 using the `Executors.newFixedThreadPool(4)` method. The `execute()` method is then used to submit two tasks to the pool, which are printed to the console. The `shutdown()` method is then called to shut down the pool and wait for the tasks to complete.