package threads;
class MyFirst implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class MyRunnableManager {
 MyRun my = new MyRun();
}
