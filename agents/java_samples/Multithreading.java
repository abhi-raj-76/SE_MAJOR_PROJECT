import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Multithreading {
  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(4);
    executor.execute(new TaskA());
    executor.execute(new TaskB());
    executor.shutdown();
  }
}

class TaskA implements Runnable {
  @Override
  public void run() {
    System.out.println("Task A");
  }
}

class TaskB implements Runnable {
  @Override
  public void run() {
    System.out.println("Task B");
  }
}