import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class MultithreadingExample {
  public static void main(String[] args) {
    ExecutorService executor = Executors.newCachedThreadPool();
    executor.execute(new Runnable() {
      public void run() {
        System.out.println("Task 1 is running");
      }
    });
    executor.execute(new Runnable() {
      public void run() {
        System.out.println("Task 2 is running");
      }
    });
    executor.shutdown();
  }
}

This Java class uses the `ExecutorService` class to create a cached thread pool and execute two tasks concurrently. The `ExecutorService` class provides a convenient way to manage a pool of threads, and the `shutdown()` method is called to shut down the executor when the program is finished. The `execute()` method is used to submit a task to the executor, which will be executed asynchronously. In this example, two tasks are submitted to the executor, each printing a message to the console.