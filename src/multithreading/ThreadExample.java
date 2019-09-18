package multithreading;

public class ThreadExample {
    public static void main(String[] args) {
        int n = 100;

        Runnable task = new Task(n, 100, "Hello, first thread");
        Thread printingThread = new Thread(task);
        Runnable secondTask = new Task(n, 150, "Hello, second thread");
        Thread secondThread = new Thread(secondTask);
        printingThread.start();
        secondThread.start();

        System.out.println("Here we continue program");
    }
}
