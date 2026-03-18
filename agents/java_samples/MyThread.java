public class MyThread extends Thread {
  public static void main(String[] args) {
    MyThread thread1 = new MyThread("Thread 1");
    MyThread thread2 = new MyThread("Thread 2");
    MyThread thread3 = new MyThread("Thread 3");
    MyThread thread4 = new MyThread("Thread 4");

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
  }

  public MyThread(String name) {
    super(name);
  }

  public void run() {
    System.out.println("Hello from " + Thread.currentThread().getName());
  }
}

This code creates four threads, each with a different name, and starts them. The `run()` method is called for each thread, which prints a message to the console.