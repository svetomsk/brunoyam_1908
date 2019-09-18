package multithreading;

public class Task implements Runnable {
    private int n;
    private long delay;
    private String text;

    public Task(int n, long delay, String text) {
        this.n = n;
        this.delay = delay;
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
